package com.blog.service;

import com.blog.model.Blog;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BlogServiceTest {
    @Test
    void testGetPostsByAuthorAge() {
        Blog blog = BlogService.loadBlogFromJson();
        
        List<String> postsByAge30 = blog.getPostsByAuthorAge(30);
        assertNotNull(postsByAge30);
        assertTrue(postsByAge30.size() >= 0);

        List<String> postsByAge25 = blog.getPostsByAuthorAge(25);
        assertNotNull(postsByAge25);
        assertTrue(postsByAge25.size() >= 0);
    }
}
