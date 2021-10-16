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

### Graphql Queries
1. findAllProducts: List all products and their corresponding comments in database
```graphql
{
  findAllProducts{
    id
    name
    comments {
      id
      commentDescription
    }
  }
}
```
2. findAllProductsByIds: Find products by ids and select specific fields

```graphql
{
  findAllProductsByIds(ids:[1,2]){
    id
    name
    comments {
      id
      commentDescription
    }
  }
}
```

[Link]: https://graphql-demo-dinesh.herokuapp.com/graphiql?query=%23%20%7B%0A%23%20%20%20findAllProducts%7B%0A%23%20%20%20%20%20id%0A%23%20%20%20%20%20name%0A%23%20%20%20%20%20comments%20%7B%0A%23%20%20%20%20%20%20%20id%0A%23%20%20%20%20%20%20%20commentDescription%0A%23%20%20%20%20%20%7D%0A%23%20%20%20%7D%0A%23%20%7D%0A%0A%7B%0A%20%20findAllProductsByIds(ids%3A%5B1%5D)%7B%0A%20%20%20%20id%0A%20%20%20%20name%0A%20%20%20%20comments%20%7B%0A%20%20%20%20%20%20id%0A%20%20%20%20%20%20commentDescription%0A%20%20%20%20%7D%0A%20%20%7D%0A%7D

[REST-Link]:https://graphql-demo-dinesh.herokuapp.com/getproducts