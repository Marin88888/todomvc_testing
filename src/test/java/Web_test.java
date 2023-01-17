import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class Web_test {
    WebDriver driver = new ChromeDriver();

    @Test
    public void Load_page() {
        String expected_url = "https://todomvc.com/";
        driver.get(expected_url);
        String current_url = driver.getCurrentUrl();
        Assert.assertEquals(current_url,expected_url);
    }
    @Test
     public void Polymer(){
        Load_page();
        //click on the Javascript tab
        driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[1]/div")).click();
        //click on the Polymer link
        WebElement Polymer_link= driver.findElement(By.linkText("Polymer"));
        Assert.assertTrue(Polymer_link.isDisplayed());
        Polymer_link.click();




    }






}
