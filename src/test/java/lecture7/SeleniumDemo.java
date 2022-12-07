package lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
    @Test
    public void someDemoTest() {
        String path = "C:\\Users\\jelen\\IdeaProjects\\SomeProjectGradle\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");

        driver.findElement(By.id("mtd_300")).click();

        Select dealType = new Select(driver.findElement(By.cssSelector("select[name='sid']")));
//        Select dealType = new Select(driver.findElement(By.xpath("select[name='sid']")));

        dealType.selectByValue("/lv/animals/dogs/sell/");

        driver.findElement(By.id("f_o_8_min")).sendKeys("20");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("2");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();

        //        driver.quit();
    }

}
