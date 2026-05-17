# Spring Boot Login Demo

Proyecto simple de inicio de sesión y registro de usuarios realizado con:

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- HTML
- Bootstrap

## Funcionalidades

- Registro de usuarios
- Inicio de sesión
- Validación de credenciales
- Conexión a base de datos MySQL
- Interfaz simple con Bootstrap

## Tecnologías utilizadas

- Java 21+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Maven
- Bootstrap 5

## Configuración de la base de datos

Crear una base de datos en MySQL:

```sql
CREATE DATABASE login_demo;
```

Configurar el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/login_demo
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Ejecutar el proyecto

Clonar el repositorio:

```bash
git clone https://github.com/Tomii8r/Springboot-Login-Demo.git
```

Entrar a la carpeta:

```bash
cd Springboot-Login-Demo
```

Ejecutar el proyecto:

```bash
./mvnw spring-boot:run
```

o desde IntelliJ IDEA ejecutando la clase principal.

## Estructura del proyecto

```text
src
 ├── main
 │   ├── java
 │   │   ├── controller
 │   │   ├── model
 │   │   ├── repository
 │   │   └── service
 │   └── resources
 │       ├── static
 │       ├── templates
 │       └── application.properties
```

## Capturas

- Pantalla de login
- Pantalla de registro
- Conexión a MySQL

## Autor

Tomás Erazo