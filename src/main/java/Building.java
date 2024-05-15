import java.time.LocalDate;

public abstract class Building {

    //  Properties
    protected String name;
    protected int numberOfRooms;
    protected LocalDate dateOfConstruction;
    protected double sellingPrice;
    protected double buyingPrice;

   //   Constructors
    public Building(String name, int numberOfRooms, LocalDate dateOfConstruction, double sellingPrice, double buyingPrice){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public int addRoom(int roomsToAdd){
        numberOfRooms += roomsToAdd;
        return numberOfRooms;
    }

    public double calculateSellingProfit(){
        return sellingPrice - buyingPrice;
    }


    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms =numberOfRooms;
    }

    public LocalDate getDateOfConstruction(){
        return dateOfConstruction;
    }
    public void setDateOfConstruction(LocalDate dateOfConstruction){
        this.dateOfConstruction = dateOfConstruction;
    }

    public double getSellingPrice(){
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice(){
        return buyingPrice;
    }
    public void setBuyingPrice(double buyingPrice){
        this.buyingPrice = buyingPrice;
    }
}
