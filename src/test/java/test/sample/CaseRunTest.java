package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CaseRunTest {

    @Test(timeOut=3000)
    public void testCase0(){
        assertEquals(2+2,4);
    }

    @Test
    public void testCase1(){
        assertEquals(2+2,4);
    }

    @Test
    public void testCase2(){
        assertEquals(2+2,4);
    }
}
