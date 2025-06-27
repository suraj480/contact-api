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
contact-form-backend/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── suraj/
│ │ │ └── contactform/
│ │ │ ├── controller/
│ │ │ │ └── ContactMessageController.java
│ │ │ ├── model/
│ │ │ │ └── ContactMessage.java
│ │ │ ├── repository/
│ │ │ │ └── ContactMessageRepository.java
│ │ │ └── service/
│ │ │ └── ContactMessageService.java
│ ├── resources/
│ │ ├── application.properties
│ │ └── static/ (optional for frontend files)
├── pom.xml
└── README.md