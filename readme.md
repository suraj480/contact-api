# 📬 Contact Form Backend API

A simple Spring Boot backend API to receive and store contact form submissions in a MySQL database. This can be connected with any frontend (e.g., HTML, React, etc.) to build a full contact solution.

---

## 🚀 Features

- Receive messages via REST API
- Store form data in MySQL
- Java 17 and Spring Boot
- CORS enabled for frontend integration
- Built with clean architecture: Controller, Service, Repository

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

---

## 📂 Project Structure

├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───suraj
│   │   │           └───contactform
│   │   │               └───model
│   │   └───resources
│   │       ├───static
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───suraj
│                   └───contactform
└───target
    ├───classes
    │   ├───com
    │   │   └───suraj
    │   │       └───contactform
    │   │           └───model
    │   └───META-INF
    │       └───maven
    │           └───com.suraj.contactform
    │               └───contact-api
    └───test-classes
        └───com
            └───suraj
                └───contactform