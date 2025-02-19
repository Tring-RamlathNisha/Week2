public class Car extends Vehicle{
 
 private int numDoors;
 //private boolean isConvertible;
 private String fuelType;
 
 public Car(String type ,String make, String model, int year, double rentalRate, int numPers, String fuelType) {
  super(type,make, model, year, rentalRate);
  this.numDoors = numPers;
  //this.isConvertible = isConvertible;
  this.fuelType = fuelType;
 }
 
 @Override
 public void displayInfo() {
  super.displayInfo();
  System.out.println("No. of accomodate persons: " + numDoors);
  //System.out.println("Convertible: " + isConvertible);
  System.out.println("Fuel Type: " + fuelType);
 }

}