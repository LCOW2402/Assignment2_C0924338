package com.blog.model;  // ✅ Ensure the correct package

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@ToString
@EqualsAndHashCode
@Builder
public class BlogPost {
    private final String id;
    private final String authorId;
    private final String postContent;

    public BlogPost(String id, String authorId, String postContent) {
        if (id == null) throw new IllegalArgumentException("ID cannot be null.");
        if (authorId == null) throw new IllegalArgumentException("Author ID cannot be null.");

        this.id = id;
        this.authorId = authorId;
        this.postContent = postContent;
    }
}
