package com.blog;

import java.util.List;
import java.util.Scanner;

import com.blog.model.Blog;
import com.blog.service.BlogService;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Loading Blog Data...");

        // ✅ Load Blog from JSON
        Blog blog = BlogService.loadBlogFromJson();

        // ✅ Print total posts and contributors
        System.out.println("📌 Total Blog Posts: " + blog.getPosts().size());
        System.out.println("📌 Total Contributors: " + blog.getContributors().size());

        // ✅ Prompt user for age input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age to find blog posts: ");
        
        try {
            int age = scanner.nextInt();
            scanner.close();

            // ✅ Get posts by author age
            List<String> postIds = blog.getPostsByAuthorAge(age);
            
            if (postIds.isEmpty()) {
                System.out.println("❌ No blog posts found for authors aged " + age);
            } else {
                System.out.println("📌 Blog Posts by Authors Aged " + age + ": " + postIds);
            }

        } catch (Exception e) {
            System.err.println("❌ Invalid input. Please enter a valid number.");
        }
    }
}
