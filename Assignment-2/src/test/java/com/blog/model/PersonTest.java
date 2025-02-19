import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testValidPersonCreation() {
        Person person = Person.builder()
                .id("123")
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .gender("Male")
                .build();
        assertNotNull(person);
    }

    @Test
    void testInvalidPersonCreation() {
        assertThrows(IllegalArgumentException.class, () ->
                Person.builder().id(null).firstName("John").lastName("Doe").age(30).gender("Male").build()
        );
    }
}
