# Spring Boot Login Demo

Sistema de autenticación de usuarios desarrollado con Spring Boot y Spring Security.

## Tecnologías utilizadas

- Java 21+
- Spring Boot
- Spring Security
- Spring MVC
- Spring Data JPA
- MySQL
- Maven
- HTML5
- Bootstrap 5

## Funcionalidades

- Registro de usuarios
- Inicio de sesión seguro
- Autenticación con Spring Security
- Hasheo de contraseñas con BCrypt
- Protección de rutas privadas
- Manejo de sesiones
- Persistencia de usuarios en MySQL
- Interfaz responsive con Bootstrap

## Seguridad implementada

El proyecto utiliza Spring Security para:

- Autenticación automática de usuarios
- Manejo de sesiones
- Protección de endpoints
- Validación segura de credenciales
- Encriptación de contraseñas mediante BCryptPasswordEncoder

Las contraseñas se almacenan hasheadas y nunca en texto plano.

## Arquitectura de autenticación

El flujo de autenticación funciona mediante:

- `SecurityFilterChain`
- `CustomUserDetailsService`
- `DaoAuthenticationProvider`
- `BCryptPasswordEncoder`

Spring Security se encarga automáticamente de:

- Procesar el login
- Validar usuarios
- Comparar contraseñas
- Gestionar sesiones
- Restringir acceso a rutas protegidas

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

Entrar a la carpeta del proyecto:

```bash
cd Springboot-Login-Demo
```

Ejecutar la aplicación:

```bash
./mvnw spring-boot:run
```

o ejecutar la clase principal desde IntelliJ IDEA.

## Estructura del proyecto

```text
src
 ├── main
 │   ├── java
 │   │   ├── config
 │   │   ├── controllers
 │   │   ├── dao
 │   │   ├── models
 │   │   └── service
 │   └── resources
 │       ├── static
 │       ├── templates
 │       └── application.properties
```

## Capturas

- Pantalla de login
- Registro de usuarios
- Validaciones de autenticación
- Persistencia en MySQL

## Autor

Tomás Erazo