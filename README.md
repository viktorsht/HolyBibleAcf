# Holy Bible API

A Holy Bible API is a Java Spring Boot application that provides access to verses of the Holy Bible in the ACF (Almeida Corregida e Fiel) version. An API allows you to query verses based on the book and chapter of the Bible.
## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- MySQL Server

## Database Configuration

1. Create a MySQL database named `holybible`.
2. Edit the `src/main/resources/application.properties` file to configure the database connection information:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/holybible
spring.datasource.username=your_username
spring.datasource.password=your_password
```
## Running the Application

To run the application, follow these steps:

1. Navigate to the project's root directory.
2. Run the following command to compile and start the application:

```shell
mvn spring-boot:run
```

## Using the API

### Querying Verses by Book and Chapter

To query verses by book and chapter, you can make a GET request to the following URL:

```bash
http://localhost:8080/verses/{book}/{chapter}
```
This will return all verses from book 1, chapter 1 of the Bible.

## Contribution

Feel free to contribute to this open-source project. You can open issues, submit pull requests, or provide feedback.

To open an issue or feature request, use the Issues page.
