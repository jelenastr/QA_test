package lecture8.ForumCinemas.pages;

import lecture8.pages.BasePage;
import lecture8.ForumCinemas.ProfileAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfilePageForumCinemas extends BasePage {
    public ProfileAttributes profileAttributes = new ProfileAttributes();
    private By profileEditForumCinemas = By.cssSelector("a[href='/mypage/Index/']");
    private By firstName = By.id("inputFirstName");
    private By lastName = By.id("inputLastName");

    private By dayOfBirthday = By.id("bdDay");
    private By monthOfBirthday = By.id("bdMonth");
    private By yearOfBirthday = By.id("bdYear");

    private By phoneNumber = By.id("inputMobile");

    private By city = By.id("inputCity");

    private By unknownGender = By.id("genderUnknown");
    private By maleGender = By.id("genderMale");
    private By femaleGender = By.id("genderFemale");
    private By language = By.id("preferredLanguage");
    private By submit = By.cssSelector("button[type='submit'][class='btn btn-default']");

    private By checkedGender = By.cssSelector("input[checked='']");

    public void selectProfileActionForumCinemas(String action) {
        if ("edit profile".equals(action)) {
            driver.findElement(profileEditForumCinemas).click();
        } else {
            System.out.println("Something went wrong in Profile Page");
        }
    }

//    public void editProfileDataForumCinemas(String userFirstName, String userLastName, String userDayOfBirthday, String userMonthOfBirthday, String userYearOfBirthday, String userPhoneNumber, String userCity, String userGender, String userLanguage) {
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
    public void fillProfileDataForumCinemas(String userFirstName) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(userFirstName);
    }

    public void fillProfileDataForumCinemas(String userLastName) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(userLastName);
    }

    public void changeProfileDataForumCinemas(int userDayOfBirthday) {
        Select dayOfBirth = new Select(driver.findElement(dayOfBirthday));
        if ("11".equals(userDayOfBirthday)) {
            dayOfBirth.selectByValue("11");
        }
    }
    public void changeProfileDataForumCinemas(int userMonthOfBirthday) {
        Select monthOfBirth = new Select(driver.findElement(monthOfBirthday));
        if ("12".equals(userMonthOfBirthday)) {
            monthOfBirth.selectByValue("12");
        }
    }
    public void changeProfileDataForumCinemas(int userYearOfBirthday) {
        Select yearOfBirth = new Select(driver.findElement(yearOfBirthday));
        if ("2000".equals(userYearOfBirthday)) {
            yearOfBirth.selectByValue("2000");
        }
    }

    public void editProfileDataForumCinemas(String userPhoneNumber) {
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(userPhoneNumber);
    }

    public void editProfileDataForumCinemas(String cityValue) {
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(cityValue);
    }
    public void tryUserGender(String userGenderValue) {
            Select userGender = new Select(driver.findElement(userGenderValue));
//
//                  if (userGender.equals("unknown")) {

    WebElement radio1 = driver.findElement(By.id("genderUnknown"));
radio1.click();
    WebElement radio2 = driver.findElement(By.id("genderMale"));
radio2.click();
    WebElement radio3 = driver.findElement(By.id("genderFemale"));
radio3.click();

        Select gender = new Select(driver.findElement(userGenderValue));
        if ("Nezināms".equals(userGenderValue)) {
            gender.selectByValue("genderUnknown");
        } else if ("Vīrietis".equals(userGenderValue)) {
            gender.selectByValue("genderMale");
        } else if ("Sieviete".equals(userGenderValue)) {
            gender.selectByValue("genderFemale");
        } else {
            System.out.println("There is no such language.");
        }
        driver.findElement(submit).click();
    }

    public void changeLanguageTo(String languageValue) {
        Select language = new Select(driver.findElement(languageValue));
        if ("Latviešu".equals(languageValue)) {
            language.selectByValue("1002");
        } else if ("Krievu".equals(languageValue)) {
            language.selectByValue("1004");
        } else if ("Angļu".equals(languageValue)) {
                language.selectByValue("1000");
        } else {
            System.out.println("There is no such language.");
        }
            driver.findElement(submit).click();
        }

        public void collectData () {
            profileAttributes.setFirstName(driver.findElement(firstName).getAttribute("value"));
            profileAttributes.setLastName(driver.findElement(lastName).getAttribute("value"));
            profileAttributes.setDayOfBirthday(driver.findElement(dayOfBirthday).getAttribute("data-value"));
            profileAttributes.setMonthOfBirthday(driver.findElement(monthOfBirthday).getAttribute("data-value"));
            profileAttributes.setYearOfBirthday(driver.findElement(yearOfBirthday).getAttribute("data-value"));
            profileAttributes.setPhoneNumber(driver.findElement(phoneNumber).getAttribute("value"));
            profileAttributes.setCity(driver.findElement(city).getAttribute("value"));
            profileAttributes.setGender(driver.findElement(checkedGender).getAttribute("id"));
            profileAttributes.setLanguage(driver.findElement(language).getAttribute("data-value"));
        }

//    public void collectData() {
    }
