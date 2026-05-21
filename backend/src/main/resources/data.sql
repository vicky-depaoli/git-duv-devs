INSERT INTO Autor (dni, nombre, apellido, fecha_nacimiento) VALUES
('11111111A', 'Gabriel', 'García Márquez', '1927-03-06'),
('22222222B', 'Isabel', 'Allende', '1942-08-02'),
('33333333C', 'Julio', 'Cortázar', '1914-08-26'),
('44444444D', 'J.K.', 'Rowling', '1965-07-31'),
('55555555E', 'Stephen', 'King', '1947-09-21');

INSERT INTO Libro (isbn, nombre, fecha, autor_id) VALUES
('9780307474728', 'Cien años de soledad', '1967-05-30', 1),
('9780307387264', 'El amor en los tiempos del cólera', '1985-12-05', 1),
('9780307474742', 'Crónica de una muerte anunciada', '1981-04-01', 1),
('9788497592451', 'El coronel no tiene quien le escriba', '1961-11-01', 1),
('9788420471839', 'Relato de un náufrago', '1970-03-01', 1);

INSERT INTO Libro (isbn, nombre, fecha, autor_id) VALUES
('9780307474735', 'La casa de los espíritus', '1982-10-15', 2);

INSERT INTO Libro (isbn, nombre, fecha, autor_id) VALUES
('9788439733225', 'Rayuela', '1963-06-28', 3);

INSERT INTO Libro (isbn, nombre, fecha, autor_id) VALUES
('9788498387070', 'Harry Potter y la piedra filosofal', '1997-06-26', 4),
('9788498387087', 'Harry Potter y la cámara secreta', '1998-07-02', 4),
('9788498387094', 'Harry Potter y el prisionero de Azkaban', '1999-07-08', 4),
('9788498387100', 'Harry Potter y el cáliz de fuego', '2000-07-08', 4),
('9788498387117', 'Harry Potter y la Orden del Fénix', '2003-06-21', 4),
('9788498387124', 'Harry Potter y el misterio del príncipe', '2005-07-16', 4),
('9788498387131', 'Harry Potter y las Reliquias de la Muerte', '2007-07-21', 4);

INSERT INTO Libro (isbn, nombre, fecha, autor_id) VALUES
('9788497593793', 'It (Eso)', '1986-09-15', 5),
('9788497592208', 'El resplandor', '1977-01-28', 5);
