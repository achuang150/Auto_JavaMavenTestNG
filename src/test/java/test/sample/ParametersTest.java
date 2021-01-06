package test.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParametersTest {

    @Test(enabled=false)
    @Parameters({"add1","add2","result"})
    public void testAdd1(int add1,int add2,int result){
        assertEquals(add1+add2,result);
    }

}
