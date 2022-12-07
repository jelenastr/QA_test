package lecture8;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends BasePage {

    private final By findElementCars = By.id("mtd_97");
    private final By minCarPrice = By.id("f_o_8_min");
    private final By maxCarPrice = By.id("f_o_8_max");
    private final By minYearSelector = By.cssSelector("[value='2001']");
    private final By maxEngineSelector = By.cssSelector("[value='3.0']");
    private final By carColorSelector = By.cssSelector("[value='6318']");
    private final By submitButton = By.xpath("//input[@class='b s12']");


    public void pressFindElementCars(String categoryValue) {          //ошибка
        driver.findElement(findElementCars).click();
    }

    public void fillMinMaxCarPrice(String min, String max) {
        driver.findElement(minCarPrice).sendKeys(min);
        driver.findElement(maxCarPrice).sendKeys(max);
    }

    public void changeMinYearTo(String minYearValue) {
        Select minYear = new Select(driver.findElement(minYearSelector));
        if ("2001".equals(minYearValue)) {
            minYear.selectByValue("select[id='f_o_18_min']");
        } else {
            System.out.println("Something went wrong with selector YEAR!");
        }
    }

    public void changeMaxEngineTo(String maxEngineValue) {
        Select maxEngine = new Select(driver.findElement(maxEngineSelector));
        if ("3.0".equals(maxEngineValue)) {
            maxEngine.selectByValue("select[id='f_o_15_max']");
        } else {
            System.out.println("Something went wrong with selector ENGINE VOLUME!");
        }
    }

    public void changeCarColorTo(String carColorValue) {
        Select carColor = new Select(driver.findElement(carColorSelector));
        if ("Balta".equals(carColorValue)) {
            carColor.selectByValue("select[class='filter_sel l75']");
        } else {
            System.out.println("Something went wrong with selector COLOR!");
        }
    }

    public void pressSubmitButton() {                  //ошибка
        driver.findElement(submitButton).click();
    }
}
