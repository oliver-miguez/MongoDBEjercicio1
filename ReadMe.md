## Ejercicio 1 MongoDB
## Usando maven y Spring


---


### Estructura de la API

El servicio expone dos conjuntos de *endpoints* principales: uno para la gestión de Adestradores y otro para Pokemon.

#### Adestradores (Entrenadores)

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `POST` | `/mongodb/adestrador/gardar` | Crea o guarda un nuevo Adestrador. |
| `GET` | `/mongodb/adestrador/listarTodos` | Lista todos los Adestradores registrados. |
| `GET` | `/mongodb/adestrador/getProfedeAlumno/{id}` | Busca el Pokémon asociado a un Adestrador específico por su ID. |

#### Pokemon

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `POST` | `/mongodb/pokemon/gardar` | Crea o guarda un nuevo Pokémon. |
| `GET` | `/mongodb/pokemon/listarTodos` | Lista todos los Pokémon registrados. |



### Configuración y Ejecución

#### 1. Configuración de la Base de Datos

El proyecto se conecta a la base de datos a través del archivo `application.properties`. Debe asegurar que la URI de MongoDB sea accesible.

**`src/main/resources/application.properties`:**
```properties
spring.data.mongodb.uri=mongodb://10.0.9.100:27017/probas
server.port=8092
# ... (otras propiedades)