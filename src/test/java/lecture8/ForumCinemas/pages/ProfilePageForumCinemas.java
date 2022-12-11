package lecture8.ForumCinemas.pages;

import lecture8.pages.BasePage;
import lecture8.ForumCinemas.ProfileAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


    public void editProfileDataForumCinemas(String userFirstName, String userLastName, String userDayOfBirthday, String userMonthOfBirthday, String userYearOfBirthday, String userPhoneNumber, String userCity, String userGender, String userLanguage) {

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(userFirstName);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(userLastName);
        Select dayOfBirth = new Select(driver.findElement(dayOfBirthday));
        dayOfBirth.selectByValue(userDayOfBirthday);
        Select monthOfBirth = new Select(driver.findElement(monthOfBirthday));
        monthOfBirth.selectByValue(userMonthOfBirthday);
        Select yearOfBirth = new Select(driver.findElement(yearOfBirthday));
        yearOfBirth.selectByValue(userYearOfBirthday);
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(userPhoneNumber);
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(userCity);
 //       if (userGender.equals("unknown")) {
//            WebElement radio = driver.findElement(By.id("male"));
//            radio.click();

   //         WebElement genderRadio = driver.findElement(maleGender);
     //       genderRadio.click();
       // } else if {
//        (userGender.equals("male")) {
  //     } else if (userGender.equals("female")) {
   //     } else {
//            System.out.println("There is no such gender.");

        Select languageSelection = new Select(driver.findElement(language));
        languageSelection.selectByValue(userLanguage);
        driver.findElement(submit).click();
        }

        public void collectData() {
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
//    }
//
//    public void collectData() {
    }
