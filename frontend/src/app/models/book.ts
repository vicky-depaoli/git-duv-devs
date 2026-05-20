import { Author } from './author';

export interface Book {
  id?: number;
  nombre: string;
  fecha: string;
  ismn: string;
  autor: Author;
}
