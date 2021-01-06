package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test(groups = {"功能测试"})
public class GroupsTest {

    @Test(groups = {"高","正常"})
    public void testCase4(){
        assertEquals(2+2,4);
    }

    @Test(groups = {"高","正常"})
    public void testCase5(){
        assertEquals(5-3,2);
    }

    @Test(groups = {"中","正常"})
    public void testCase6(){
        assertEquals(2/1,2);
    }

    @Test(groups = {"低","异常"},expectedExceptions = RuntimeException.class)
    public void testCase7(){
        assertEquals(2/0,1);
    }
}
