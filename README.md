# **Product Management System**  
The **Product Management System** is a backend application built using **Java and Spring Boot**, implementing **RESTful APIs** to manage product-related operations. The project follows **clean coding principles** and maintains a structured architecture for scalability and maintainability.  

## **Tech Stack**  
- **Java** (Spring Boot)  
- **Spring Data JPA**  
- **MySQL**  
- **Flyway** (for database migration)  
- **Maven**  
- **Lombok** (for cleaner code)  

## **Project Structure**  

```
sanjanaynvsdl-product-management-system/
│── mvnw
│── mvnw.cmd
│── pom.xml
│── src/
│   ├── main/
│   │   ├── java/com/example/productservicedb/
│   │   │   ├── ProductServiceDbApplication.java  # Main entry point
│   │   │   ├── Controllers/                      # Handles HTTP requests
│   │   │   ├── CustomExceptions/                 # Custom exceptions
│   │   │   ├── DTOs/                             # Data Transfer Objects
│   │   │   ├── ExceptionHandlers/                # Global exception handling
│   │   │   ├── Models/                           # Entity classes
│   │   │   ├── Repositories/                     # Data access layer
│   │   │   ├── Service/                          # Business logic
│   │   ├── resources/
│   │   │   ├── application.properties            # Database configurations
│   │   │   ├── db/migration/                     # Flyway migrations
│   ├── test/
│   │   ├── java/com/example/productservicedb/
│   │   │   ├── ProductServiceDbApplicationTests.java  # Unit tests
│── .jpb/  # Project settings
│── .mvn/  # Maven wrapper
```

---

## **API Endpoints**  

### **Product Controller (`/api/products`)**  

| HTTP Method | Endpoint         | Description                 |
|------------|----------------|-----------------------------|
| GET        | `/all`         | Get all products           |
| GET        | `/{id}`        | Get a product by ID        |
| POST       | `/create`      | Add a new product          |
| PUT        | `/update/{id}` | Update an existing product |
| DELETE     | `/delete/{id}` | Delete a product          |

### **Category Controller (`/api/categories`)**  

| HTTP Method | Endpoint         | Description                   |
|------------|----------------|-------------------------------|
| GET        | `/all`         | Get all categories           |
| POST       | `/create`      | Add a new category           |

---

## **Database Configuration**  

Update the `application.properties` file with your MySQL credentials:  

```properties
spring.datasource.url=
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## **Setup & Installation**  

### **Prerequisites**  
- Java 17+  
- MySQL  
- Maven  

### **Steps to Run**  

1. **Clone the repository**  
   ```sh
   git clone https://github.com/sanjanaynvsdl/Product-Management-System.git
   cd product-management-system
   ```

2. **Configure the Database**  
   - Create a MySQL database named `productdb`.  
   - Update credentials in `application.properties`.
     

3. **Build & Run the application**  
   ```sh
   mvn spring-boot:run
   ```

4. **Test the API**  
   - Use **Postman** or **cURL** to test the API endpoints.  



