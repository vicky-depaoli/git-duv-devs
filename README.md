# git-duv-devs
Reto Final FP Dual NTT Data

## Configuración de la Base de Datos (H2 en memoria)

Para el equipo de Backend, las rutas de los scripts de inicialización de la base de datos se encuentran en:
* Estructura (Tablas): backend/schema.sql
* Datos de prueba (Seeders): backend/data.sql

### Configuración para el application.properties:
properties
# Habilitar la consola web de H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuración de la conexión en memoria
spring.datasource.url=jdbc:h2:mem:biblioteca
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Inicialización automática con los scripts
spring.sql.init.mode=always

---

### ¿Cómo añadir esto en tu pantalla actual de GitHub?
1. En la pantalla que me muestras, hacer clic en el icono del lápiz que está arriba a la derecha (al lado del botón *Raw*).
2. Ir al final del texto que ya existe, da un par de intros para dejar espacio y pegar el bloque de código gris de arriba.
3. Bajar del todo, haz clic en el botón verde -Commit changes- y listo.
