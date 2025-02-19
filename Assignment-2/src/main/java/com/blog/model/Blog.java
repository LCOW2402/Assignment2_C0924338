package com.blog.model;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@ToString
@EqualsAndHashCode
public class Blog {
    private final List<BlogPost> posts;
    private final List<Person> contributors;

    /**
     * ✅ Constructor for Blog (ensures valid data)
     */
    public Blog(List<BlogPost> posts, List<Person> contributors) {
        if (posts == null || contributors == null) {
            throw new IllegalArgumentException("Posts and Contributors cannot be null.");
        }
        this.posts = posts;
        this.contributors = contributors;
    }

    /**
     * ✅ Returns Blog Post IDs where the author's age matches the input age.
     * ✅ Uses Java Streams (No loops allowed).
     */
    public List<String> getPostsByAuthorAge(Integer age) {
        if (age == null || age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer.");
        }

        return posts.stream()
                .filter(post -> contributors.stream()
                        .anyMatch(person -> person.getId().equals(post.getAuthorId()) && person.getAge().equals(age)))
                .map(BlogPost::getId)
                .collect(Collectors.toList());
    }
}
