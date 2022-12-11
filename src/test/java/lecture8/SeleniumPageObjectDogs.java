package lecture8;

import lecture8.pages.BasePage;
import lecture8.pages.DogsPage;
import lecture8.pages.HomePage;
import org.junit.jupiter.api.Test;

public class SeleniumPageObjectDogs {

    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();


    @Test
    public void someDemoTest() {
        homePage.openBaseUrl();
        homePage.chooseCategory("dogs");
        dogsPage.changeDealTypeTo("sell");
        dogsPage.fillMinMaxAge("1", "3");
        dogsPage.fillMinMaxPrice("10", "200");
    }
//        homePage.stopDriver();
}
