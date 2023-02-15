import org.example.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import java.lang.Object;
import org.junit.Assume;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assumptions.*;

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
    @DisplayName("New Test")
    public void newTest(){
        String str1 = "abc";
        String str2 = "pqr";
        String str3 = "xyz";
        assertAll("numbers",() -> assertEquals(str1,"abc"),() -> assertEquals(str2,"pqr"),
                () -> assertEquals(str3,"xyz")
        );
    }

    @Test
    void testAssumingThat() {
        System.setProperty("env", "test");
        assumingThat("test".equals(System.getProperty("env")), () -> { assertEquals(10, 10);System.out.println("perform below assertions only on the test env");});
        assertEquals(20, 20);
        System.out.println("perform below assertions on all env");
    }



    @Test
    @DisplayName("Assume True")
    void testAssumeTrue() {
        boolean b = 'A' == 'B';
        assumeFalse(b);
        assumeFalse(b,"THis is false");
        // will run only when this b is false
        boolean q = 'B' == 'B';
        assumeTrue(q,"This is true");
        // will run only when this q is true
        assertEquals("Hello", "Hello");
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
//        assumeTr
        System.out.println("In test2");
    }

    @AfterAll
    static public void testAfterAll(){
        System.out.println("After ALL");
    }
}
