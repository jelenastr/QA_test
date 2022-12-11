package lecture8.pages;

import lecture8.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends BasePage {

    private final By findElementCars = By.id("mtd_97");
    private final By minCarPrice = By.id("f_o_8_min");
    private final By maxCarPrice = By.id("f_o_8_max");
    private final By minYearSelector = By.cssSelector("select[name='topt[18][min]']");
    private final By maxEngineSelector = By.cssSelector("select[name='topt[15][max]']");
    private final By carColorSelector = By.cssSelector("select[name='opt[17]']");
    private final By submitButton = By.cssSelector("input[class='b s12']");


    public void chooseCategory(String categoryValue) {
        driver.findElement(findElementCars).click();
    }

    public void fillMinMaxCarPrice(String min, String max) {
        driver.findElement(minCarPrice).sendKeys(min);
        driver.findElement(maxCarPrice).sendKeys(max);
    }

    public void changeMinYearTo(String minYearValue) {
        Select minYear = new Select(driver.findElement(minYearSelector));
        if ("2001".equals(minYearValue)) {
            minYear.selectByValue("2001");
        } else {
            System.out.println("Something went wrong with selector YEAR!");
        }
    }

    public void changeMaxEngineTo(String maxEngineValue) {
        Select maxEngine = new Select(driver.findElement(maxEngineSelector));
        if ("3.0".equals(maxEngineValue)) {
            maxEngine.selectByValue("3.0");
        } else {
            System.out.println("Something went wrong with selector ENGINE VOLUME!");
        }
    }

    public void changeCarColorTo(String carColorValue) {
        Select carColor = new Select(driver.findElement(carColorSelector));
        if ("Balta".equals(carColorValue)) {
            carColor.selectByValue("6318");
        } else {
            System.out.println("Something went wrong with selector COLOR!");
        }

    }
}
