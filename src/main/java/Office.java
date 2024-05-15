import java.time.LocalDate;

public class Office extends Building {
    //properties
    protected String companyName;
    protected int numberOfOfficeRooms;

    //constructors
    public Office(String companyName, int numberOfOfficeRooms, String name, int numberOfRooms, LocalDate dateOfConstruction, double sellingPrice, double buyingPrice){
        super(name, numberOfRooms, dateOfConstruction, sellingPrice, buyingPrice);
        this.companyName = companyName;
        this.numberOfOfficeRooms = numberOfOfficeRooms;
    }

    public void addConferenceRooms() {
        this.numberOfOfficeRooms +=1;
    }

    // Getter and Setters
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfOfficeRooms(){
        return numberOfOfficeRooms;
    }
    public void setNumberOfOfficeRooms(int numberOfOfficeRooms){
        this.numberOfOfficeRooms = numberOfOfficeRooms;
    }


}
