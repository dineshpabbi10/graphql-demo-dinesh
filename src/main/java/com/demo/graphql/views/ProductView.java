package com.demo.graphql.views;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductView {
    private Integer id;
    private String name;

    List<CommentView> comments;
}
