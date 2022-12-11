package lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarSeleniumDemo {
    @Test
    public void CarDemoTest() {
        String path = "C:\\Users\\jelen\\IdeaProjects\\SomeProjectGradle\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");

        driver.findElement(By.cssSelector("button[onclick='_cookie_confirm();return false;']")).click();

        driver.findElement(By.id("mtd_97")).click();

        driver.findElement((By.id("f_o_8_min"))).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");

        Select carYear = new Select(driver.findElement(By.cssSelector("select[onchange='this.form.submit();']")));
        carYear.selectByValue("2001");

        Select carEngineVolume = new Select(driver.findElement(By.cssSelector("select[id='f_o_15_max']")));
        carEngineVolume.selectByValue("3.0");

        Select carColor = new Select(driver.findElement(By.cssSelector("select[class='filter_sel l75']")));
        carColor.selectByValue("6318");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();
//        driver.quit();
    }
}
