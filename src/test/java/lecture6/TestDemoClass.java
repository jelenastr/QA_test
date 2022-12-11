package lecture6;

import org.junit.jupiter.api.*;

public class TestDemoClass {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Print before all");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Print after all");
    }
    @BeforeEach
    public void setup(){
        System.out.println("Print before each");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Print after each");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }
    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
