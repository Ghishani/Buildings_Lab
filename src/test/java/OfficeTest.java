import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    void setUp() {
        office = new Office("Gryfindor", 50, "Shard", 500, LocalDate.of(2002,7,8),70_000_000,40_000_000);
    }
    @Test
    public void canAddConferenceRooms(){
        int expected = 51;
        office.addConferenceRooms();
        assertThat(office.getNumberOfOfficeRooms()).isEqualTo(expected);
    }

}
