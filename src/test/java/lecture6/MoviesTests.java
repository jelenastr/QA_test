package lecture6;

import org.assertj.core.api.SoftAssertionError;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class MoviesTests {

    Movies movies = new Movies();

    @BeforeAll
    public void setUp() {
        movies.setMovieName("Rocketman");
        movies.setDirector("Dexter Fletcher");
        movies.setGenre("Musical / Drama");
        movies.setYear(2019);
        movies.setBoxOffice(100000000);
        movies.setBudget(41000000);
    }

    @AfterEach
    public void tearDown() {
        movies = null;
    }

    @Test
    public void test1ForMovie() {
        SoftAssertions softAssertions = new SoftAssertions();
        assertThat(movies.getMovieName()).isEqualTo("Rocketman");
        assertThat(movies.getDirector()).isEqualTo("Dexter Fletcher");
        assertThat(movies.getGenre()).isEqualTo("Musical / Drama");
        assertThat(movies.getYear()).isBetween(2018, 2022);
        assertThat(movies.getBoxOffice()).isCloseTo(190000000, Percentage.withPercentage(10));
        assertThat(movies.getBudget()).isGreaterThan(30000000);
    }

}
