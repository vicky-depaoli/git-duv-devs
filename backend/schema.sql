DROP TABLE IF EXISTS Libro;
DROP TABLE IF EXISTS Autor;

CREATE TABLE Autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(9) NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE,
    cantidad_libros INT DEFAULT 0
);

CREATE TABLE Libro (
    isbn VARCHAR(13) PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL,
    fecha_publicacion DATE,
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES Autor(id) ON DELETE SET NULL
);
