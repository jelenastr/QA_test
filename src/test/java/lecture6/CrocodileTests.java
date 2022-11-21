package lecture6;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CrocodileTests {

    Crocodile crocodile = new Crocodile();
    boolean hungry = true;


    @Test
    public void testForCrocodile() {

        crocodile.setCrocodileWeight(1000);
        crocodile.setCrocodileColor("Dark green");
        crocodile.setCrocodileLength(7);
        crocodile.setCrocodileName("The Nile crocodile");
        crocodile.setCrocodileHungry(hungry);

        assertThat(crocodile.getCrocodileWeight()).isCloseTo(1000, Percentage.withPercentage(15));
        assertThat(crocodile.getCrocodileColor()).isEqualTo("Dark green");
        assertThat(crocodile.getCrocodileLength()).isGreaterThan(6);
        assertThat(crocodile.getCrocodileName()).isEqualTo("The saltwater crocodile");
        assertThat(crocodile.getCrocodileHungry()).isEqualTo(hungry);
    }
}

