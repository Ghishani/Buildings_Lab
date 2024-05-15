import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow(true, "Lotus", 4, LocalDate.of(2000,2,23), 400_000,200_000);
    }
    @Test
    public void canHaveCentralHeating() {
        boolean expected = true;
        boolean result = bungalow.getCentralHeating();
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canAddLoftExtension_noArguments(){
        int expected = 5;
        bungalow.addLoftExtension();
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(expected);
    }

    @Test
    public void canAddLoftExtension_hasArguments(){
        int expected = 7;
        bungalow.addLoftExtension(3);
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(expected);
    }

    }
