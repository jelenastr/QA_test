package lecture8.ForumCinemas;

import lecture8.ForumCinemas.pages.HomePageForumCinemas;
import lecture8.ForumCinemas.pages.LoginPageCinemas;
import lecture8.ForumCinemas.pages.ProfilePageForumCinemas;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class ForumCinemasDemoObject {
    HomePageForumCinemas homePageForumCinemas = new HomePageForumCinemas();
    LoginPageCinemas loginPageCinemas = new LoginPageCinemas();
    ProfilePageForumCinemas profilePageForumCinemas = new ProfilePageForumCinemas();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testLoginProfileChange() {
        homePageForumCinemas.openBaseUrl();
        homePageForumCinemas.selectForumCinemasAction("login");
        loginPageCinemas.forumCinemasLogin(", ");
        loginPageCinemas.pressSubmitButton();
        homePageForumCinemas.selectForumCinemasAction("Profile");
        profilePageForumCinemas.selectProfileActionForumCinemas("edit profile");

 //       profilePageForumCinemas.editProfileDataForumCinemas("Vards", "Uzvards", "11", "12", "2000", "11111111", "Riga", "female", "1000");

        
        profilePageForumCinemas.collectData();

        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getFirstName()).isEqualTo("Vards");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getLastName()).isEqualTo("Uzvards");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getDayOfBirthday()).isEqualTo("11");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getMonthOfBirthday()).isEqualTo("12");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getYearOfBirthday()).isEqualTo("2000");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getPhoneNumber()).isEqualTo("11111111");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getCity()).isEqualTo("Riga");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getGender()).isEqualTo("female");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getPhoneNumber()).isEqualTo("11111111");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getLanguage()).isEqualTo("1000");
        softAssertions.assertAll();

        profilePageForumCinemas.profileAttributes = null;
        homePageForumCinemas.stopDriver();
    }


    }


