package lecture8;

import lecture8.pages.BasePage;
import lecture8.pages.CarsPage;
import lecture8.pages.HomePage;
import org.junit.jupiter.api.Test;

import static lecture8.pages.BasePage.driver;

public class SeleniumObjectCars {

    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    CarsPage carsPage = new CarsPage();

    @Test
    public void setCarsPage() {

        homePage.openBaseUrl();
        homePage.chooseCategory("cars");
        carsPage.fillMinMaxCarPrice("10000", "20000");
        carsPage.changeMinYearTo("2001");
        carsPage.changeMaxEngineTo("3.0");
        carsPage.changeCarColorTo("Balta");


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        driver.quit();
//        basePage.closeChrome();
    }
}

//        homePage.stopDriver();



