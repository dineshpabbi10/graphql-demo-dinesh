# **Demo Graphql**

* URL : [Graphql Playground URL][Link]
* REST API endpoint : [/getproducts][REST-Link]
* Stack : Java, Sprint Boot, Spring Boot Data JPA, Spring Boot starter web, Postgres, Spring Boot Graphql Starter

**Graphql Dependencies used**
```xml
<dependency>
    <groupId>com.graphql-java</groupId>
    <artifactId>graphql-spring-boot-starter</artifactId>
    <version>5.0.2</version>
</dependency>
<dependency>
    <groupId>com.graphql-java</groupId>
    <artifactId>graphql-java-tools</artifactId>
    <version>5.2.4</version>
</dependency>
<dependency>
    <groupId>com.graphql-java</groupId>
    <artifactId>graphiql-spring-boot-starter</artifactId>
    <version>5.0.2</version>
</dependency>
```


[Link]: https://graphql-demo-0109.herokuapp.com/graphiql?query=%7B%0A%20%20findAllProducts%7B%0A%20%20%20%20id%0A%20%20%20%20name%0A%20%20%20%20comments%7B%0A%20%20%20%20%20%20id%0A%20%20%20%20%20%20commentDescription%0A%20%20%20%20%7D%0A%20%20%7D%0A%7D

[REST-Link]:https://graphql-demo-0109.herokuapp.com/getproducts