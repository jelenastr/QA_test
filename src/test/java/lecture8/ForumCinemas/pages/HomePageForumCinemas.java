package lecture8.ForumCinemas.pages;

import lecture8.pages.BasePage;
import org.openqa.selenium.By;

import static lecture8.pages.BasePage.driver;

public class HomePageForumCinemas {

    public void openBaseUrl() {
    }

    public void selectForumCinemasAction(String login) {
    }

    public void stopDriver() {
        driver.quit();
    }

    public class HomePage extends BasePage {

        private final By registerCategory = By.id("btn btn-user btn-default");

        private static String baseUrl = "https://www.forumcinemas.lv/";



        public void openBaseUrl() {
            startDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
        }
    }


}
