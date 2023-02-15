import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

//public class test2 {
    @Nested
    class test2 {
        @BeforeEach
        void beforeEach() {
            System.out.println("**--- InnerClass :: beforeEach :: Executed before each test method ---**");
        }

        @AfterEach
        void afterEach() {
            System.out.println("**--- InnerClass :: afterEach :: Executed after each test method ---**");
        }

        @Test
        void testMethod1() {
            System.out.println("**--- InnerClass :: testMethod1 :: Executed test method1 ---**");
        }

        @Nested
        class InnerMostClass {

            @BeforeEach
            void beforeEach() {
                System.out.println("**--- InnerMostClass :: beforeEach :: Executed before each test method ---**");
            }

            @AfterEach
            void afterEach() {
                System.out.println("**--- InnerMostClass :: afterEach :: Executed after each test method ---**");
            }

            @Test
            void testMethod2() {
                System.out.println("**--- InnerMostClass :: testMethod2 :: Executed test method2 ---**");
            }
        }
    }
