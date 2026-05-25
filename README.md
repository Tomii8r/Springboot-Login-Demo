# Spring Boot Login Demo

Sistema de autenticación de usuarios desarrollado con Spring Boot y Spring Security utilizando arquitectura MVC y persistencia con MySQL.

## Tecnologías utilizadas

- Java 21+
- Spring Boot
- Spring Security
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- HTML5
- Bootstrap 5

## Características principales

- Registro de usuarios
- Inicio de sesión seguro
- Autenticación basada en sesiones
- Hasheo de contraseñas con BCrypt
- Protección de rutas privadas
- Manejo automático de autenticación con Spring Security
- Persistencia de usuarios en MySQL
- Interfaz responsive con Bootstrap

## Seguridad implementada

El proyecto utiliza Spring Security para administrar la autenticación y autorización de usuarios.

### Funcionalidades de seguridad

- Autenticación automática
- Protección de endpoints privados
- Manejo de sesiones HTTP
- Logout seguro
- Validación de credenciales
- Encriptación de contraseñas mediante BCrypt

Las contraseñas nunca se almacenan en texto plano.

## Arquitectura de autenticación

El flujo de autenticación se implementa utilizando:

- `SecurityFilterChain`
- `CustomUserDetailsService`
- `DaoAuthenticationProvider`
- `BCryptPasswordEncoder`

Spring Security se encarga automáticamente de:

- Procesar solicitudes de login
- Validar usuarios contra la base de datos
- Comparar contraseñas hasheadas
- Mantener sesiones autenticadas
- Restringir acceso a rutas protegidas

## Flujo de autenticación

```text
Usuario → Formulario Login → Spring Security
        → CustomUserDetailsService
        → MySQL
        → BCryptPasswordEncoder
        → Sesión autenticada
```

## Estructura del proyecto

```text
src
 ├── main
 │   ├── java
 │   │   ├── config
 │   │   │   └── SecurityConfig
 │   │   ├── controllers
 │   │   ├── dao
 │   │   ├── models
 │   │   └── service
 │   │       └── CustomUserDetailsService
 │   │
 │   └── resources
 │       ├── static
 │       ├── templates
 │       └── application.properties
```

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

## Instalación y ejecución

Clonar el repositorio:

```bash
git clone https://github.com/Tomii8r/Springboot-Login-Demo.git
```

Entrar al directorio del proyecto:

```bash
cd Springboot-Login-Demo
```

Ejecutar la aplicación:

```bash
./mvnw spring-boot:run
```

o ejecutar la clase principal desde IntelliJ IDEA.

## Funcionalidades futuras

- Roles de usuario (`USER` / `ADMIN`)
- Validaciones con Bean Validation
- API REST con JWT
- Panel de administración
- Recuperación de contraseña


## Autor

Tomás Erazo