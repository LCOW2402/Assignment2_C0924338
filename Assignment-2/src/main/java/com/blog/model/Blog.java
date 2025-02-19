package com.blog.model;  // ✅ Ensure the correct package

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Blog {
    private final List<BlogPost> posts;
    private final List<Person> contributors;

    public Blog(List<BlogPost> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }
}
