package lecture6;


import org.assertj.core.api.SoftAssertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoviesTests {

    Movies movies = new Movies();

    @BeforeEach
    public void setUp() {
        movies.setMovieName("Rocketman");
        movies.setDirector("Dexter Fletcher");
        movies.setGenre("Musical / Drama");
        movies.setYear(2019);
        movies.setBoxOffice(100000000);
        movies.setBudget(41000000);
    }

    @AfterEach
    public void tearDown(){
        movies = null;
    }

    @Test
    public void test1ForMovie() {

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(movies.getMovieName()).isEqualTo("Rocketman");
        softAssertions.assertThat(movies.getDirector()).isEqualTo("Dexter Fletcher");
        softAssertions.assertThat(movies.getGenre()).isEqualTo("Drama");
        softAssertions.assertThat(movies.getYear()).isBetween(2018, 2022);
        softAssertions.assertThat(movies.getBoxOffice()).isCloseTo(150000000, Percentage.withPercentage(10));
        softAssertions.assertThat(movies.getBudget()).isGreaterThan(50000000);
        softAssertions.assertAll();
    }

}
