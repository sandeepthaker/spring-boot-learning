# Getting Started

* [Download Spring starter project](https://start.spring.io/)
    * Select maven/gradle project
    * Select appropriate language and spring stable version to avoid any issue in development
    * Provide groupId and artifactId
    * Add Spring Web dependency
    * Hit Generate button

* Unzip the downloaded project
* Add Book.java and BookController.java to start with

### Book.java
```java
package com.learning.boot.springbootlearning;

public class Book {

    private Long id;

    private String name;

    private String author;

    public Book() {}

    public Book(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

```  

### BooksController.java

```java
package com.learning.boot.springbootlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getBooks(){
        return Arrays.asList(new Book(1L,"Learning Spring Boot Demo","Sandeep Thaker"));
    }
}

```

Start spring boot application from SpringBootLearningApplication.java

Url -> http://localhost:8080/books

Response 
```json
[
  {
    id: 1,
    name: "Learning Spring Boot Demo",
    author: "Sandeep Thaker"
  }
]
```