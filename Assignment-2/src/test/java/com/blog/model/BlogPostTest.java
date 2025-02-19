import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlogPostTest {
    @Test
    void testValidBlogPostCreation() {
        BlogPost post = BlogPost.builder()
                .id("1")
                .authorId("123")
                .postContent("Hello World")
                .build();
        assertNotNull(post);
    }

    @Test
    void testInvalidBlogPostCreation() {
        assertThrows(IllegalArgumentException.class, () ->
                BlogPost.builder().id(null).authorId("123").postContent("Hello").build()
        );
    }
}
