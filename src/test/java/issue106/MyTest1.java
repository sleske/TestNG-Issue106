package issue106;

import org.testng.annotations.Test;

public class MyTest1 {
    
    @Test
    public void testEins(){
        System.out.println("Running: MyTest1.testEins");
    }

    @Test(dependsOnMethods ="testEins")
    public void testZwei(){
        System.out.println("Running: MyTest1.testZwei");
    }

    @Test(dependsOnMethods ="testZwei")
    public void testDrei(){
        System.out.println("Running: MyTest1.testDrei");
    }
}
