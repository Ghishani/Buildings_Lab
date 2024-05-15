import java.util.ArrayList;

public class Council {

    private ArrayList<Building> buildings;

    public Council() {
        this.buildings = new ArrayList<>();
    }
    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuildings(Building buildings){
        this.buildings.add(buildings);
    }
}
