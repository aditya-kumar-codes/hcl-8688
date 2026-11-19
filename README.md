# Java Full-Stack & Spring Boot Learning Roadmap

A structured, step-by-step collection of Core Java, Hibernate, and Spring Boot projects organized in progressive learning order—from foundational Java concepts to full-stack backend APIs and security.

---

## Learning Path (Step-by-Step)

| Step | Folder | Topics & Concepts Covered |
| :--- | :--- | :--- |
| **1** | [`HCL-8688`](./HCL-8688) | **Core Java:** OOP principles, constructors, inheritance, abstraction, interfaces, Java 8 lambdas & built-in functional interfaces, Collections framework, Generics, and Exception Handling. |
| **2** | [`HibProject`](./HibProject) | **Hibernate ORM:** XML configuration (`hibernate.cfg.xml`), entity mapping, sessions, and database persistence without boilerplate SQL. |
| **3** | [`SpringApp`](./SpringApp) | **Spring Core:** Inversion of Control (IoC), Dependency Injection (DI), application context, and bean lifecycle management. |
| **4** | [`SpringJDBC`](./SpringJDBC/SpringJDBC) | **Spring JDBC:** Relational database connectivity, `JdbcTemplate`, and clean DAO data-access patterns. |
| **5** | [`spring-data-jpa`](./spring-data-jpa) | **Spring Data JPA:** Repository abstractions, ORM entity relationships, and derived query methods. |
| **6** | [`RestAPI`](./RestAPI) | **Spring Boot REST APIs:** Building RESTful endpoints with `@RestController`, HTTP methods (`GET`, `POST`, `PUT`, `DELETE`), and JSON serialization. |
| **7** | [`SpringSecurity`](./SpringSecurity) | **Spring Security:** Authentication, authorization, filter chains, and securing REST endpoints. |

---

## Hands-On Practice Projects

* **[`JobApp`](./JobApp/JobApp)** — Job portal backend implementing service and repository layers for managing job listings.
* **[`QuizApp`](./QuizApp)** — Quiz management service handling question banks, quiz generation, and score evaluation.
* **[`ShopApp`](./ShopApp)** — E-commerce backend built with Spring Boot and JPA entities for managing products, carts, and checkout flows.

---

## Tech Stack

* **Language:** Java (JDK 17+)
* **Frameworks:** Spring Core, Spring Boot, Spring JDBC, Spring Data JPA, Spring Security, Hibernate
* **Build Tool:** Maven
* **IDE:** IntelliJ IDEA