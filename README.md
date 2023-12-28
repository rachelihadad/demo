Project Management RESTful API with Docker
This Java application, built with Spring Boot, manages projects via a RESTful API and is containerized using Docker.

Getting Started
Prerequisites
Java Development Kit (JDK) installed
Docker installed
Build and Run
Clone the repository:

git clone https://github.com/rachelihadad/project-management-app.git cd project-management-app

Build and run the application:

./mvnw clean package java -jar target/project-management-app.jar

Access the API at http://localhost:8080.

API Usage
Retrieve all projects:

curl http://localhost:8080/projects

Create a new project:

curl -X POST -H "Content-Type: application/json" -d '{"name":"New Project","description":"Description","start_date":"2023-01-01","end_date":"2023-12-31"}' http://localhost:8080/projects

Update an existing project:

curl -X PUT -H "Content-Type: application/json" -d '{"name":"Updated Project","description":"Updated Description","start_date":"2023-01-01","end_date":"2024-12-31"}' http://localhost:8080/projects/{id}

Delete an existing project:

curl -X DELETE http://localhost:8080/projects/{id}

Docker Containerization
Build and Run Docker Container
docker build -t project-management-app . docker-compose up

Access the application at http://localhost:8080.
