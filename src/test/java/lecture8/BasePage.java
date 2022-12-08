package lecture8;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static ChromeDriver driver;

    public void startDriver() {
        String path = "C:\\Users\\jelen\\IdeaProjects\\SomeProjectGradle\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", path);
        driver = new ChromeDriver();
//        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome() {
    }

//    public void stopDriver() {
//        driver.quit();
//    }
}

