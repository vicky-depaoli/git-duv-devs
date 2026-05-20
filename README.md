# git-duv-devs
Reto Final FP Dual NTT Data

## 🗄️ Configuración de la Base de Datos (H2 en memoria)

Para los del backend, os dejo por aquí las rutas de los archivos con las tablas y los datos de prueba:
* **Estructura de las tablas:** `backend/schema.sql`
* **Datos de ejemplo:** `backend/data.sql`

Aquí tenéis lo que hay que pegar en vuestro `application.properties`:
```properties
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
```
