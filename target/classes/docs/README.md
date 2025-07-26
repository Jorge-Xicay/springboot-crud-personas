# CRUD de Personas - Spring Boot

Este proyecto es una aplicación web desarrollada con **Spring Boot** que implementa operaciones CRUD para gestionar una lista de personas conectadas a una base de datos MySQL.

## Características

- Crear, leer, actualizar y eliminar registros de personas.
- Conexión a base de datos MySQL usando Spring Data JPA.
- Documentación automática con Swagger/OpenAPI.
- Arquitectura MVC limpia.

## Tecnologías utilizadas

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- MySQL
- Thymeleaf
- Swagger (SpringDoc OpenAPI 3)

## Instalación

1. Clona el repositorio:

```bash
git clone https://github.com/usuario/mi-crud-personas.git
cd mi-crud-personas
```

2. Crea la base de datos MySQL:

```sql
CREATE DATABASE cruddemo;
```

3. Configura el archivo `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/cruddemo
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

4. Ejecuta la aplicación:

```bash
./mvnw spring-boot:run
```

5. Accede a la app en `http://localhost:8080/personas`  
   Documentación Swagger en `http://localhost:8080/swagger-ui.html`

---
