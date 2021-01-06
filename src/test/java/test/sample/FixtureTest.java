package test.sample;

import org.testng.annotations.*;

public class FixtureTest {


    @BeforeClass
    public static void beforeClass(){
        System.out.println("---------beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("----------afterClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("-----------beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("-----------afterMethod");
    }

    @Test
    public void testCase1(){
        System.out.println("----------test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("---------test case 2");
    }
}
