package lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliExpressSeleniumDemo {

    @Test
    public void AliExpressDemoTest() {
        String path = "C:\\Users\\jelen\\IdeaProjects\\SomeProjectGradle\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://best.aliexpress.com/");

        driver.findElement(By.cssSelector("button[class='btn-accept']")).click();
        driver.findElement(By.cssSelector("div[class='Sk1_X _1-SOk']")).click();

        driver.findElement((By.name("SearchText"))).sendKeys("tattoo");
        driver.findElement(By.cssSelector("input[class='search-button']")).click();

        driver.findElement(By.cssSelector("input[placeholder='min']")).sendKeys("10");
        driver.findElement(By.cssSelector("input[placeholder='max']")).sendKeys("20");

        driver.findElement(By.cssSelector("a[class='ui-button narrow-go']")).click();

//        driver.quit();

    }
}
