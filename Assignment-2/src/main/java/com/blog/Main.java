package com.blog;

import com.blog.model.Person;
import com.blog.model.BlogPost;
import com.blog.model.Blog;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("🚀 Starting Part 1: Testing Person, BlogPost, and Blog Classes");

            // ✅ Create a Person instance
            Person person1 = Person.builder()
                    .id("P001")
                    .firstName("John")
                    .lastName("Doe")
                    .age(30)
                    .gender("Male")
                    .build();

            Person person2 = Person.builder()
                    .id("P002")
                    .firstName("Jane")
                    .lastName("Smith")
                    .age(25)
                    .gender("Female")
                    .build();

            // ✅ Create BlogPost instances
            BlogPost post1 = BlogPost.builder()
                    .id("B001")
                    .authorId("P001") // Matches John's ID
                    .postContent("Hello, this is my first blog post!")
                    .build();

            BlogPost post2 = BlogPost.builder()
                    .id("B002")
                    .authorId("P002") // Matches Jane's ID
                    .postContent("Another day, another blog post.")
                    .build();

            // ✅ Create a Blog with posts and contributors
            Blog blog = new Blog(Arrays.asList(post1, post2), Arrays.asList(person1, person2));

            // ✅ Print the created objects to verify correctness
            System.out.println("📌 Created Person 1: " + person1);
            System.out.println("📌 Created Person 2: " + person2);
            System.out.println("📌 Created Blog Post 1: " + post1);
            System.out.println("📌 Created Blog Post 2: " + post2);
            System.out.println("📌 Created Blog: " + blog);

        } catch (IllegalArgumentException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
