package com.blog.service;

import com.blog.model.Blog;
import com.blog.model.BlogPost;
import com.blog.model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class BlogService {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * ✅ Reads JSON file and converts it into a List of objects
     */
    public static <T> List<T> readJsonFile(String filePath, TypeReference<List<T>> typeReference) {
        try {
            return objectMapper.readValue(new File(filePath), typeReference);
        } catch (IOException e) {
            System.err.println("❌ Error reading JSON file: " + filePath);
            return List.of();  // ✅ Return an empty list if file is missing/corrupt
        }
    }

    /**
     * ✅ Reads JSON files & creates a Blog instance
     */
    public static Blog loadBlogFromJson() {
        List<Person> people = readJsonFile("src/main/resources/person.json", new TypeReference<List<Person>>() {});
        List<BlogPost> posts = readJsonFile("src/main/resources/blogPosts.json", new TypeReference<List<BlogPost>>() {});
        return new Blog(posts, people);
    }
}
