import java.time.LocalDate;

public class Bungalow extends Building {
        private boolean centralHeating;

        public Bungalow(boolean centralHeating, String name, int numberOfRooms, LocalDate dateOfConstruction, double sellingPrice, double buyingPrice){
            super( name, numberOfRooms, dateOfConstruction, sellingPrice, buyingPrice);
            this.centralHeating = centralHeating;
        }
        public void addLoftExtension() {
            this.numberOfRooms += 1;
        }

        public void addLoftExtension(int inputNumberOfRooms){
            this.numberOfRooms += inputNumberOfRooms;
        }

        public boolean getCentralHeating(){
            return this.centralHeating;
        }
    }
