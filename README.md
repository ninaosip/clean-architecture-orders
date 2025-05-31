# 🧱 Clean Architecture Order Service (Java + Spring Boot)

Este proyecto es una demo de arquitectura limpia (*Clean Architecture*) implementada con **Java 17**, **Spring Boot 3** y preparada para **entornos productivos**, incluyendo:

- ✅ Separación por capas: Domain, Application, Infrastructure, Interfaces  
- ✅ Autenticación JWT (OAuth2 Resource Server)  
- ✅ Documentación con Swagger/OpenAPI  
- ✅ CI/CD con GitHub Actions  
- ✅ Docker y Docker Compose  
- ✅ Testcontainers con PostgreSQL para tests de integración  
- ✅ Configuración explícita del main class para el plugin Spring Boot  

---

## 📘 Guía rápida / Quick Guide

> 🇪🇸 Esta es una demo completa de arquitectura limpia (*Clean Architecture*) en Java, pensada para proyectos empresariales modernos. Incluye autenticación JWT, pruebas de integración con Testcontainers, documentación con Swagger y despliegue con Docker.

> 🇬🇧 This is a complete Clean Architecture demo in Java, designed for modern enterprise applications. It includes JWT authentication, Testcontainers-based integration tests, Swagger documentation, and Docker deployment.

---

### 🇪🇸 ¿Cómo puedo usar este proyecto?

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/clean-architecture-orders.git
   cd clean-architecture-orders
   ```

2. Construye y ejecuta con Maven:  
   ```bash
   mvn spring-boot:run
   ```

3. Accede a la documentación Swagger:  
   - [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

4. Lanza la app con Docker:  
   ```bash
   docker-compose -f build/docker-compose.yml up --build
   ```

---

### 🇬🇧 How can I use this project?

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/clean-architecture-orders.git
   cd clean-architecture-orders
   ```

2. Build and run with Maven:  
   ```bash
   mvn spring-boot:run
   ```

3. Access Swagger documentation:  
   - [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

4. Run the app with Docker:  
   ```bash
   docker-compose -f build/docker-compose.yml up --build
   ```

---

## 🚀 Ejecutar tests

El proyecto usa **Testcontainers** para pruebas de integración con PostgreSQL. Ejecuta:

```bash
mvn test
```

---

## 🔐 Seguridad con JWT

Este servicio requiere autenticación vía JWT. Puedes integrarlo con:

- AWS Cognito  
- Auth0  
- Keycloak  
- Azure AD  

Modifica en `application.properties`:

```properties
spring.security.oauth2.resourceserver.jwt.issuer-uri=https://your-issuer.com
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=https://your-issuer.com/.well-known/jwks.json
```

---

## 📦 Endpoints expuestos

| Método | Endpoint      | Descripción            |
|--------|---------------|------------------------|
| POST   | `/orders`     | Crea un nuevo pedido   |

Consulta la documentación interactiva en Swagger.

---

## 🛠 CI/CD

Pipeline con GitHub Actions para:

- Build y tests automáticos con Maven  
- Compatible con JDK 17 y Spring Boot 3  

---

## ✨ Créditos

Creado por [Nina Osipova](https://www.linkedin.com/in/nina-o-823554196) como demo para arquitectura Java empresarial moderna.

---

## 📘 Recursos

- [Spring Boot](https://spring.io/projects/spring-boot)  
- [Springdoc OpenAPI](https://springdoc.org/)  
- [Testcontainers](https://www.testcontainers.org/)  
- [Clean Architecture - Robert C. Martin](https://www.oreilly.com/library/view/clean-architecture-a/9780134494272/)  

---

> ¿Quieres usar esto como base para tus proyectos? Puedes clonarlo, adaptarlo y ampliarlo libremente.
