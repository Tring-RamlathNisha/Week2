public class Bike extends Vehicle{
 
 private String bikeType;
 
 public Bike(String type,String make, String model, int year, double rentalRate, String bikeType) {
  super(type,make, model, year, rentalRate);
  this.bikeType = bikeType;
 }
 
 @Override
 public void displayInfo() {
  super.displayInfo();
  System.out.println("Bike Type: " + bikeType);
 }

}