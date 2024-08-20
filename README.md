# Product Management Application

## Overview

This application allows users to manage a list of products. Users can view, add, and manage product details through a web interface. The application is built using Angular for the frontend and Spring Boot for the backend API.

### Developer
- **Mahiedine Ferdjoukh**

### Java Version
- **Java 11**

## Features
- View a list of products
- Add new products
- Product detail view
- User-friendly interface with modern design

## Prerequisites

Before you start, ensure you have the following installed on your machine:

- **Java 11** (for the backend)
- **Node.js** and **npm** (for the frontend)
- **Docker** (if using Docker Compose)

## Setup and Running the Application

### Option 1: Manual Setup

1. **Set Up the Backend API**

   - Navigate to the backend directory:
     ```bash
     cd product-api
    ```

   - Build and run the Spring Boot application:
     ```bash
     ./mvnw spring-boot:run
     ```

   - The API should now be available at `http://localhost:8080/products`.

2. **Set Up the Angular Frontend**

   - Navigate to the frontend directory:
     ```bash
     cd product-app
     ```

   - Install the required npm packages:
     ```bash
     npm install
     ```

   - Start the Angular application:
     ```bash
     ng serve
     ```

   - The Angular app should now be accessible at `http://localhost:4200`.

### Option 2: Using Docker Compose

1. **Ensure Docker and Docker Compose are installed**.

2. **Build and Start Both Backend and Frontend Containers**

   - Navigate to the root directory where the `docker-compose.yml` file is located:
     ```bash
     cd product-project
     ```

   - Build and run the containers using Docker Compose:
     ```bash
     docker-compose up --build
     ```

   - This command will start both the backend API and the Angular frontend. The frontend will be accessible at `http://localhost:4200`, and the backend API will be available at `http://localhost:8080/products`.

## File Structure

- **product-api/**: Contains the Spring Boot application.
- **product-app/**: Contains the Angular application.
- **docker-compose.yml**: Docker Compose configuration file for running the application with Docker.

## Troubleshooting

- If you encounter issues with the Angular frontend not communicating with the backend, ensure that the backend API is running and that CORS is properly configured.
- If you have any issues with Docker, verify that Docker is running and that there are no port conflicts on your local machine.

## Contact

For any questions or feedback, please contact:

- **Mahiedine Ferdjoukh**
- **Email:** mahieddine.ferdjoukh9@gmail.com


