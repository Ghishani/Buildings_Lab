import java.time.LocalDate;

public class StudentFlat extends Building {

    protected long numberOfPartiesHosted;

    public StudentFlat(String name, int numberOfRooms, LocalDate dateOfConstruction, double sellingPrice, double buyingPrice){
        super(name, numberOfRooms, dateOfConstruction, sellingPrice, buyingPrice);
        this.numberOfPartiesHosted =0;
    }

    public long getNumberOfPartiesHosted(){
        return numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(long numberOfPartiesHosted){
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public long countNumberOfPartiesHosted() {
        return this.numberOfPartiesHosted;
    }
}
