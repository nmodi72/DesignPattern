package test.main.designpattern.factory;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.designpatterns.factory.FactoryPatternDemo;
import main.java.designpatterns.factory.impl.Circle;
import main.java.designpatterns.factory.impl.Rectangle;

public class FactoryPatternDemoTest {
    
    @DataProvider
    public Object[][] getData() {
            return new Object[][]{{"CIRCLE"}, {"RECTANGLE"}};
    }

    @Test (dataProvider = "getData")
    public void testFactoryPattern(String param){
        if(param == "Circle"){
            Assert.assertEquals(FactoryPatternDemo.getReturnShape(), new Circle().getClass());
        }else if(param == "Rectangle"){
            Assert.assertEquals(FactoryPatternDemo.getReturnShape().getClass(), new Rectangle().getClass());
        }
        
    }
}
