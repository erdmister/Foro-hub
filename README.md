Desafío ForoHub - Alura y Oracle
Descripción del Proyecto:
ForoHub es una API RESTful diseñada para gestionar un foro de discusión. Desarrollada con Java y Spring Boot, la API permite a los usuarios autenticar sus cuentas y realizar operaciones CRUD sobre tópicos y usuarios. Utiliza PostgreSQL para la persistencia de datos y Flyway para la gestión de migraciones en la base de datos.

Funcionalidades Principales:

Registro y Autenticación de Usuarios:
POST /auth/register: Crear una nueva cuenta de usuario.
POST /auth/login: Obtener un token de autenticación.
Gestión de Tópicos:
POST /api/topics: Crear un nuevo tópico.
GET /api/topics: Listar todos los tópicos.
GET /api/topics/{id}: Obtener los detalles de un tópico específico.
PUT /api/topics/{id}: Actualizar un tópico existente.
DELETE /api/topics/{id}: Eliminar un tópico (borrado lógico).
Gestión de Respuestas (en desarrollo):
PUT /api/topics/{id}/responses: Añadir una respuesta a un tópico.
GET /api/responses: Listar respuestas.
PUT /api/responses/{id}: Actualizar una respuesta.
Tecnologías Utilizadas:

Java (versión 17 en adelante)
Spring Boot (versión 3.1.5)
PostgreSQL (versión 16.x.x)
Flyway para migraciones de base de datos
Spring Security para autenticación y autorización
Lombok para reducir el boilerplate code
Swagger para documentación de la API
Configuración del Proyecto:

Clonar el Repositorio:
bash
Copiar código
git clone https://github.com/tu_usuario/forohub.git
cd forohub
Configurar PostgreSQL:
Crear una base de datos foro.
Actualizar src/main/resources/application.properties con las credenciales de PostgreSQL.
Ejecutar Migraciones:
bash
Copiar código
mvn flyway:migrate
Iniciar la Aplicación:
bash
Copiar código
mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.
Documentación y Pruebas:

Swagger UI: Explora y prueba los endpoints de la API en http://localhost:8080/swagger-ui.html.
Consideraciones Adicionales:

Roles y Permisos: Los usuarios registrados tienen permisos limitados. Se implementan roles para controlar el acceso a las funcionalidades.
Validaciones y Manejo de Errores: La API incluye validaciones de entrada y un manejo centralizado de excepciones.
Contribuciones y Licencia:
Este proyecto está bajo la licencia MIT. Las contribuciones son bienvenidas. Si tienes sugerencias o encuentras errores, abre un issue o envía un pull request.

