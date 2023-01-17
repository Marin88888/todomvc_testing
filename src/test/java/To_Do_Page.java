import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class To_Do_Page {

    @BeforeClass
    public void Before(){
        // maximize the window
        obj.driver.manage().window().maximize();
        //wait 3 seconds to load the page
        obj.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    Web_test obj=new Web_test();
    @Test
    public void add_todo(){
        obj.Polymer();
        WebElement To_do =obj.driver.findElement(By.id("new-todo"));
        //Write the first element in the To-do list
        To_do.sendKeys("First Element", Keys.RETURN);

        //Check if the first element is written correctly
        WebElement firs_element=obj.driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[1]/div/label"));
        String actual_value1=firs_element.getText();
        Assert.assertEquals(actual_value1,"First Element");

        //Write the second element in the To-do list
        To_do.sendKeys("Second Element",Keys.RETURN);

        //Check if the second element is written correctly
        WebElement second_element = obj.driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[2]/div/label"));
        String actual_value2= second_element.getText();
        Assert.assertEquals(actual_value2,"Second Element");

    }

    @Test
    public void Modify_Second_Todo(){
        add_todo();
        //find second element
        WebElement second_element= obj.driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[2]/div/label"));

        //double-click on the second element
        Actions actions = new  Actions(obj.driver);
        actions.doubleClick(second_element).perform();
        obj.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //find the new element when it is clicked (it has a different value than when it is not clicked
        WebElement se = obj.driver.findElement(By.xpath("//*[@id=\"edit\"]"));
        //send CTRL-a
        String s =Keys.chord(Keys.CONTROL,"a");
        //send delete key
        se.sendKeys(s,Keys.DELETE);
        se.sendKeys("Modified second field",Keys.RETURN);
        //Check if the second element is written correctly after the modification
        String Second_modified_text=second_element.getText();
        Assert.assertEquals(Second_modified_text,"Modified second field");



    }

}
