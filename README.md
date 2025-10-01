# 👥 PeoplePro: Full-Stack Employee Management System

## 💡 Project Introduction

**PeoplePro** is a comprehensive, full-stack web application designed to help organizations efficiently manage their employee data. Built to demonstrate core full-stack CRUD (Create, Read, Update, Delete) functionality, the application provides a robust and secure way to maintain an accurate and up-to-date repository of all employee information.

## ✨ Key Features

The primary goal of PeoplePro is to offer simple, yet powerful data management capabilities:

  * **Employee Registration (Create):** Securely register new employees with essential data fields.
  * **Information Lookup (Read):** View a detailed, searchable list of all employees and their information.
  * **Data Updates (Update):** Easily modify existing employee records to keep data current.
  * **Record Deletion (Delete):** Safely remove employee records from the system.
  * **Full-Stack Stability:** A robust, enterprise-grade foundation built on React and Spring Boot.

## 🛠️ Technology Stack
### Frontend:
1.React.js, HTML, CSS, JavaScript. (Intuitive UI built as a Single Page Application (SPA).)
2.Axios. (Efficiently manages asynchronous HTTP requests to the backend.)

### Backend: 
1.Java / Spring Boot. (Core business logic and production-ready RESTful APIs)
2.Spring JPA. (Object-Relational Mapping (ORM) for efficient database interaction)

### Database:
1.MySQL. (Reliable, structured data storage)

### Tools:
1.Docker / Docker Compose. (Containerization)
2.Jenkins. (Declarative pipeline included in the Deploy branch for automated cloud deployment (e.g., AWS))
3.Postman. (Recommended tool for testing the RESTful endpoints exposed by the Spring Boot backend).

## ⚙️ User Manual (Local Deployment)
The entire application is deployed using Docker Compose, making the setup simple and hassle-free.

### Prerequisites
You must have Docker Desktop installed and running on your system.

### Deployment Steps

1. Clone the repository: Open your terminal or command prompt and clone the project:
```bash
git clone https://github.com/dhruv-dosh/PeoplePro.git
cd PeoplePro
```
2. Start the Full Stack: Execute this single command. 
It builds the necessary Docker images for the Frontend, Backend, and MySQL database, then starts them all in detached mode (-d):
```bash
docker-compose up --build -d
```
(Wait for all services to initialize. The Spring Boot backend and the database may take a minute or two to fully start.)

3. Access the Application: Once the command completes, the web application is accessible via the frontend port:
Web App (Frontend): http://localhost:3000
REST API (Backend): http://localhost:5054

4. Stopping the Application
To stop and remove the running containers and the network:

```bash
docker-compose down
```
*For In Depth MySQL DataBase Notes [MySQL](https://github.com/dhruv-dosh/MySQL_Relational_Database_Notes)*
 
 *For In Depth Java Notes [Java_Notes](https://github.com/dhruv-dosh/Java_In_Depth_Notes)*
 
 *For Learning Spring Boot [Spring boot](https://github.com/dhruv-dosh/Spring_Java_Framework)*
 
 *For Learning Docker [Docker](https://github.com/dhruv-dosh/Docker_Notes_And_Commands)*
 
 *For Learning Jenkins [Jenkins](https://github.com/dhruv-dosh/Jenkins_Declarative_Pipeline_Setup)*

*Created and maintained by [dhruv-doshi](https://github.com/dhruv-dosh)*
