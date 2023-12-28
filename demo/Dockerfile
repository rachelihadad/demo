# Stage 1: Build the Maven project
FROM maven:3.8.4-openjdk-11-slim as builder

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the POM file and download dependencies
COPY ./pom.xml .
COPY .mvn ./.mvn
COPY mvnw .

# Make the Maven Wrapper executable
RUN chmod +x mvnw

# Download dependencies
RUN mvn dependency:go-offline

# Copy the application source code
COPY ./src ./src

# Package the application
RUN mvn package

# Stage 2: Set up MySQL (No need to expose port here)
FROM mysql:latest AS mysql-setup


# Stage 3: Set up the final image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the built JAR file from the Maven build to the final stage
COPY --from=builder /usr/src/app/target/demo-0.0.1-SNAPSHOT.jar /usr/src/app/demo-0.0.1-SNAPSHOT.jar

# Specify the command to run on container start
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
