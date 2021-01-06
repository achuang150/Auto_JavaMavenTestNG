package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DependGroupsTest {

   @Test(groups={"functest"})
    public void testAdd1(){
        assertEquals(3+2,4);
    }

    @Test(groups={"functest"})
    public void testAdd2(){
        assertEquals(3+2,5);
    }

    @Test(dependsOnGroups={"functest"})
    public void testAdd3(){
        assertEquals(3+2,5);
    }
}
