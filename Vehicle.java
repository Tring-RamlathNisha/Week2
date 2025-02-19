public class Vehicle {
 private String brand;
 private String model;
 private int year;
 private double rentalRate;
 private String vehicle_type;
 
 public Vehicle( String vehicle_type,String make, String model, int year, double rentalRate){
  this.brand=make;
  this.model = model;
  this.year = year;
  this.rentalRate = rentalRate;
  this.vehicle_type=vehicle_type;
 }

 public void displayInfo() {
  System.out.println("Vehicle Type: " +vehicle_type);
  System.out.println("Brand: " + brand);
  System.out.println("Model " + model);
  System.out.println("Year: " + year);
  System.out.println("Rental Rate: " + rentalRate);
 }
 
 public double getRentalRate() {
  return rentalRate;
 }
 
 public String getMake() {
  return brand;
 }
 
 public String getModel() {
  return model;
 }
  public String getType() {
  return vehicle_type;
 }
}