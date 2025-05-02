# Diary System

This project is a simple diary application built using Spring Boot. It allows users to create, read, update, and delete diary entries.

## Project Structure

The project is organized as follows:

```
diary-system
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── example
│   │   │   │       ├── DiarySystemApplication.java  # Entry point of the application
│   │   │   │       ├── controller
│   │   │   │       │   └── DiaryController.java     # Handles diary entry operations
│   │   │   │       ├── model
│   │   │   │       │   └── DiaryEntry.java          # Represents a diary entry
│   │   │   │       └── service
│   │   │   │           └── DiaryService.java        # Business logic for diary entries
│   │   └── resources
│   │       ├── application.properties                # Application configuration
│   │       └── templates
│   │           └── index.html                       # HTML template for the user interface
├── pom.xml                                           # Maven configuration file
└── README.md                                         # Project documentation
```

## Features

- Create new diary entries
- Retrieve existing diary entries
- Update diary entries
- Delete diary entries

## Setup Instructions

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/diary-system.git
   ```

2. Navigate to the project directory:
   ```
   cd diary-system
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

5. Open your web browser and go to `http://localhost:8080` to access the diary application.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.