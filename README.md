
<h1 align="center">🧑ForoHub👩</h1>

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos.  
Esta es una **API RESTful** que recrea (del lado del back-end) la estructura de un foro, permitiendo la creación de tópicos (**topics**) y autores para los mismos. A su vez, cumple con los requisitos de autentificación por medio de tokens, utilizando un método stateless.

## <h2>🔨Funcionalidades del proyecto </h2>  

⌨`Autentificación y Autorización de users`:  Implementación de seguridad stateless mediante JWT.    
⌨`Funciones CRUD para Autores`: permite Crear, leer, actualizar y eliminar autores mediante el uso de endpoints.  
⌨`Funciones CRUD para Topicos`: permite Crear, leer, actualizar y eliminar topicos mediante el uso de endpoints.

## <h2>Endpoints</h2>
Para realizar cambios en las tablas de la base de datos, pueden usarse los siguientes endpoints:

<h3>Autor</h3>  

- POST /autores <sub>`CREATE`</sub> : crear un nuevo autor.
- GET /autores <sub>`READ`</sub> : Obtener una lista de autores.
- GET /autores/{id} <sub>`READ`</sub> :  Obtener un autor por ID.
- PUT /autores <sub>`UPDATE`</sub> : actualizar un autor.
- DELETE /autores/{id} <sub>`DELETE`</sub> : eliminar un autor.

  <h3>Topicos</h3>
  
- POST /topicos <sub>`CREATE`</sub> : crear un nuevo topico.
- GET /topicos <sub>`READ`</sub> : Obtener una lista de topicos.
- GET /topicos/{id} <sub>`READ`</sub> :  Obtener un topico por ID.
- PUT /topicos <sub>`UPDATE`</sub> : actualizar un topico.
- DELETE /topicos/{id} <sub>`DELETE`</sub> : eliminar un topico.
- 
  <h3>Autentificación</h3>
  
- POST /login <sub>`CREATE`</sub> : Generar un token de autenticación para un autor.
  
## <h2>🧰Tecnologías utilizadas</h2>  

📌 Java 21  
📌 Java Spring 3.3.1  
📌 Project Maven  
📌 MySQL 8 

<h3>Dependencias utilizadas</h3>

📌 Lombok  
📌 Spring Web  
📌 Spring Boot DevTools  
📌 Spring Data JPA  
📌 Flyway Migration  
📌 MySQL Driver  
📌 Validation  
📌 Spring Security  
📌 com.auth0:java-jwt

## <h2>✍Autor</h2>

Bruno Inguanzo  
Alura Latam ONE G6  
inguanzobruno@gmail.com  
