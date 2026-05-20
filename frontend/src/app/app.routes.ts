import { Routes } from '@angular/router';
import { BookList } from './components/book-list/book-list';
import { BookDetail } from './components/book-detail/book-detail';
import { BookForm } from './components/book-form/book-form';
import { AuthorList } from './components/author-list/author-list';

export const routes: Routes = [
  { path: '', component: BookList },
  { path: 'books/:id', component: BookDetail },
  { path: 'new-book', component: BookForm },
  { path: 'authors', component: AuthorList }
];