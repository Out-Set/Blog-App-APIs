package com.project.blogappapis.Payloads;

import com.project.blogappapis.Entity.Category;
import com.project.blogappapis.Entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private String title;

    private String content;

    private String imageName;

    private Category category;

    private User user;

}
