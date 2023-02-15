import org.example.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

@Tag("development")
public class test1 {

    @Before
    static public void testBefore(){
        System.out.println("Before test");
    }

    @BeforeAll
    static public void testBeforeAll(){
        System.out.println("Before ALL");
    }

    @BeforeEach
    public void testBeforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    public void testAfterEach(){
        System.out.println("After Each");
    }

    @Test
//    @Disabled
    @DisplayName("Test Checking Max Speed")
    public void testCheckMaxSpeed() {
        Car car=new Car(20,70);
        String str = null;
        String str1="abc";
        assertEquals("condition is true",car.getMaxSpeed(),70);
        Assertions.assertFalse(car.getMaxSpeed()==60,"Condition is False");
        Assertions.assertNull(str,"Failed");
        Assertions.assertNotNull(str1,"Failed");
        System.out.println("In test1");
        Assertions.assertTrue(2==2);
//        Assertions.assertThrows("");
    }

    @After
    static public void testAfter(){
        System.out.println("After test");
    }

    @Test
    @DisplayName("Test Checking Min Speed")
    public void testCheckMinSpeed() {
        Car car=new Car(20,70);
        assertEquals(car.getMinSpeed(),20);
        assertEquals("msg",2,2);
//        asser
        System.out.println("In test2");
    }

    @AfterAll
    static public void testAfterAll(){
        System.out.println("After ALL");
    }
}
