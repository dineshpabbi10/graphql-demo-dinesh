package com.demo.graphql.model;

import com.demo.graphql.views.CommentView;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "comments",schema = "public")
public class Comments {
    @Id
    @NonNull
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comment_description")
    @NonNull
    private String comment_description;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = Product.class)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    public CommentView toView(){
        return CommentView.builder()
                .commentDescription(this.getComment_description())
                .id(this.getId())
                .build();
    }
}
