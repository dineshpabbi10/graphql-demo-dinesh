package com.demo.graphql.model;

import com.demo.graphql.views.ProductView;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "products",schema = "public")
public class Product {

    @Id
    @NonNull
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @NonNull
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "product")
    private List<Comments> commentsList;

    public ProductView toView(){
        return ProductView.builder()
                .id(this.getProductId())
                .name(this.getName())
                .comments(
                        this.getCommentsList()
                        .stream()
                        .map(Comments::toView)
                        .collect(Collectors.toList())
                )
                .build();
    }

}
