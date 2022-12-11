package lecture6;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.*;


public class CrocodileTests {

    Crocodile crocodile = new Crocodile();
    boolean hungry = true;

    @BeforeEach
    public void setUp(){
        crocodile.setCrocodileWeight(1000);
        crocodile.setCrocodileColor("Dark green");
        crocodile.setCrocodileLength(7);
        crocodile.setCrocodileName("The Nile crocodile");
        crocodile.setCrocodileHungry(hungry);
    }

    @AfterEach
    public void tearDown() {
        crocodile = null;
    }
    @Test
    public void testForCrocodile() {

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(crocodile.getCrocodileWeight()).isCloseTo(1000, Percentage.withPercentage(15));
        softAssertions.assertThat(crocodile.getCrocodileColor()).isEqualTo("Green");
        softAssertions.assertThat(crocodile.getCrocodileLength()).isGreaterThan(6);
        softAssertions.assertThat(crocodile.getCrocodileName()).isEqualTo("The saltwater crocodile");
        softAssertions.assertThat(crocodile.getCrocodileHungry()).isFalse();
        softAssertions.assertAll();
    }
}

