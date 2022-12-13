package lecture8.ForumCinemas;

import lecture8.ForumCinemas.pages.HomePageForumCinemas;
import lecture8.ForumCinemas.pages.ProfilePageForumCinemas;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ForumCinemasDemoObject {
    HomePageForumCinemas homePageForumCinemas = new HomePageForumCinemas();
    ProfilePageForumCinemas profilePageForumCinemas = new ProfilePageForumCinemas();
    SoftAssertions softAssertions = new SoftAssertions();

    @BeforeEach
    public void setUp() {
        profilePageForumCinemas.profileAttributes.setFirstName("Name");
        profilePageForumCinemas.profileAttributes.setLastName("Surname");
        profilePageForumCinemas.profileAttributes.setDayOfBirthday("11");
        profilePageForumCinemas.profileAttributes.setMonthOfBirthday("12");
        profilePageForumCinemas.profileAttributes.setYearOfBirthday("2000");
        profilePageForumCinemas.profileAttributes.setPhoneNumber("22222222");
        profilePageForumCinemas.profileAttributes.setCity("Riga");
        profilePageForumCinemas.profileAttributes.setGender("female");
        profilePageForumCinemas.profileAttributes.setLanguage("1000");
    }

    @AfterEach
    public void tearDown() {
        profilePageForumCinemas = null;
    }

    @Test
    public void testLoginProfileChange() {
        homePageForumCinemas.openBaseUrl();
        homePageForumCinemas.selectForumCinemasAction("login");
        homePageForumCinemas.selectForumCinemasAction("Profile");
        profilePageForumCinemas.selectProfileActionForumCinemas("edit profile");

        profilePageForumCinemas.editProfileDataForumCinemas("Name");
        profilePageForumCinemas.editProfileDataForumCinemas("Surname");
        profilePageForumCinemas.editProfileDataForumCinemas(11);
        profilePageForumCinemas.editProfileDataForumCinemas(12);
        profilePageForumCinemas.editProfileDataForumCinemas(2000);
        profilePageForumCinemas.editProfileDataForumCinemas("22222222");
        profilePageForumCinemas.editProfileDataForumCinemas("Riga");
        profilePageForumCinemas.editProfileDataForumCinemas("female");
        profilePageForumCinemas.editProfileDataForumCinemas("1000");


        profilePageForumCinemas.collectData();

        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getFirstName()).isEqualTo("Name");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getLastName()).isEqualTo("Surname");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getDayOfBirthday()).isEqualTo("11");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getMonthOfBirthday()).isEqualTo("12");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getYearOfBirthday()).isEqualTo("2000");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getPhoneNumber()).isEqualTo("22222222");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getCity()).isEqualTo("Riga");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getGender()).isEqualTo("female");
        softAssertions.assertThat(profilePageForumCinemas.profileAttributes.getLanguage()).isEqualTo("1000");
        softAssertions.assertAll();

        profilePageForumCinemas.profileAttributes = null;
        homePageForumCinemas.stopDriver();
    }
}


