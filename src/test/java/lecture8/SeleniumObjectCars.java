package lecture8;

import org.junit.jupiter.api.Test;

public class SeleniumObjectCars {
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
    }
//        homePage.stopDriver();
}


