import { Component, signal, inject } from '@angular/core';
import { FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { BookService } from '../../services/book';

@Component({
  selector: 'app-book-form',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './book-form.html',
  styleUrl: './book-form.css',
})
export class BookForm {
  private fb = inject(FormBuilder);
  private bookService = inject(BookService);
  private router = inject(Router);

  form = this.fb.group({
    nombre: ['', Validators.required],
    ismn:   ['', Validators.required],
    fecha:  ['', Validators.required],
  });

  submitted = signal(false);
  loading = signal(false);
  errorMessage = signal('');

  submit() {
    this.submitted.set(true);
    if (this.form.invalid) return;

    this.loading.set(true);

    this.bookService.createBook(this.form.value as any).subscribe({
      next: () => {
        this.loading.set(false);
        this.router.navigate(['/']);
      },
      error: () => {
        this.loading.set(false);
        this.errorMessage.set('Error al guardar el libro');
      }
    });
  }
}
