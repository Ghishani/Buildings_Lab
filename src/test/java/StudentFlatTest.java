import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    private StudentFlat studentFlat;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat("Greetham",100, LocalDate.of(2001,9,4), 12_000_000, 8_000_000 );
    }

    @Test
    public void canCountNumberOfPartiesHosted(){
        long expected = 0;
        long result = studentFlat.countNumberOfPartiesHosted();
        assertThat(result).isEqualTo(expected);
    }
}
