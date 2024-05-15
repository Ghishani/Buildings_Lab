import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CouncilTest {

    private Council council;

    @BeforeEach
    public void setUp(){
        council = new Council();
    }

    @Test
    public void canCountBuildings(){
        int expected = 0;
        int result = council.countBuildings();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canAddBuildings(){
      Building building = new Bungalow(true, "Lewis",200, LocalDate.of(2002,2,25),1_500_000,700_000);
        council.addBuildings(building);
        int expected = 1;
        int result = council.countBuildings();
        assertThat(result).isEqualTo(expected);
    }

}
