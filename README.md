# Parking Management System
## Features

- *Parking Spot Management:*  
  Retrieve, add, update, and delete parking spot records.
- *Database Integration:*  
  Uses PostgreSQL for data persistence.
- *Modular Architecture:*  
  Organized into controllers, services, repositories, and models for scalability and maintainability.

## Tech Stack

- *Language:* Java
- *Framework:* Spring Boot
- *Database:* PostgreSQL
- *Build Tool:* Gradle

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/parking-system.git
cd parking-system
```
### 2. Configure the Database 
Update the src/main/resources/application.properties with your PostgreSQL connection details i.e alter your username and password

### 3. Build and Run
Use Gradle to run the application:
``` bash
./gradlew bootRun
```

Your API will be available at https://localhost:8080

## API Endpoints 
- *GET /api/parking-spots*
  Retrieves a list of parking spots

### Last Update: 09/03/2025
Set up local host api.
