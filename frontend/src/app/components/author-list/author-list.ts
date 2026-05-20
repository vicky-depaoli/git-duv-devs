import { Component, OnInit, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AuthorService } from '../../services/author';
import { Author } from '../../models/author';

@Component({
  selector: 'app-author-list',
  imports: [CommonModule],
  templateUrl: './author-list.html',
  styleUrl: './author-list.css'
})
export class AuthorList implements OnInit {
  authors = signal<Author[]>([]);

  constructor(private authorService: AuthorService) {}

  ngOnInit(): void {
    this.authorService.getAuthors().subscribe({
      next: (data) => this.authors.set(data)
    });
  }
}