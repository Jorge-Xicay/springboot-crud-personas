# Documentación API - CRUD de Personas

Base URL: `http://localhost:8080/personas`

## Endpoints

### `GET /personas`

Muestra la lista de personas en la interfaz web.

### `GET /personas/new`

Muestra un formulario para registrar una nueva persona.

### `POST /personas/save`

Guarda una nueva persona enviada desde el formulario.

- **Body (form-data):**
  - nombre: string
  - apellido: string
  - direccion: string
  - telefono: string

### `GET /personas/edit/{id}`

Muestra un formulario para editar una persona existente por su ID.

### `GET /personas/delete/{id}`

Elimina la persona con el ID especificado.

### `GET /personas/test`

Devuelve un mensaje simple como texto plano.  
**Respuesta:** `"¡El controlador funciona!"`

## Swagger

Documentación interactiva disponible en:

```
http://localhost:8080/swagger-ui.html
```
