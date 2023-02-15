import org.junit.Test;

import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class test3 {
    @Test
    public void testThrowException(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Illegal Argument Exception occured");
        });
        assertThrows(ArithmeticException.class, ()->{
            System.out.println("Inside the assertThrows statement");
            throw new ArithmeticException("Divide By zero");
        });
        assertEquals("Illegal Argument Exception occured", exception.getMessage());
    }
}
