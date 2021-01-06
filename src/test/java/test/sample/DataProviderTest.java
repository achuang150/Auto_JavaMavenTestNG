package test.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DataProviderTest {

    @DataProvider(name="add")
    public Object[][] Users(){
        return new Object[][]{
                {3,2,5},
                {2,2,4},
                {3,3,6}
        };
    }

    @Test(dataProvider = "add")
    public void testAdd2(int add1,int add2,int result){
        assertEquals(add1+add2,result);
    }
}
