import { Component, signal, inject } from '@angular/core';
import { FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-book-form',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './book-form.html',
  styleUrl: './book-form.css',
})
export class BookForm {

  private fb = inject(FormBuilder);

  form = this.fb.group({
    title: ['', Validators.required],
    author: ['', Validators.required],
  });

  submitted = signal(false);
  loading = signal(false);

  submit() {
    this.submitted.set(true);

    if (this.form.invalid) return;

    this.loading.set(true);

    console.log('Libro:', this.form.value);

    setTimeout(() => {
      this.loading.set(false);
      this.form.reset();
      this.submitted.set(false);
    }, 800);
  }
}