package lecture8;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By dogsCategory = By.id("mtd_300");
    private final By carsCategory = By.id("mtd_97");
    private static String baseUrl = "https://www.ss.lv/";

    public void openBaseUrl() {
        startDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public void chooseCategory(String category) {
        if ("dogs".equals(category)) {
            driver.findElement(dogsCategory).click();
        } else if ("cars".equals(category)) {
            driver.findElement(carsCategory).click();
        } else {
            System.out.println("Something went Wrong!");

        }
    }
}
