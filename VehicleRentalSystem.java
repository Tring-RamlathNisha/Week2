import java.util.Scanner;

public class VehicleRentalSystem {
 
 public static void main(String[] args) {
  
  //Creating scanner object to get user input
  Scanner scanner = new Scanner(System.in);
  //Creating RentalSystem object which is used to call the respective methods
  RentalService rentalSystem = new RentalService();
  
  Vehicle car = new Car("Car","Toyota", "Supra", 2020, 100,4,"Petrol");
  Vehicle bike1 = new Bike("Bike","Honda", "CXR", 2000, 50,"Fuel-based");
  Vehicle bike2 = new Bike("Bike","TVS", "Jupiter 125", 2024,70,"Electric");
  Vehicle car2 = new Car("Car","Ford", "Figo", 2023, 200,4,"Diesel");
  
  rentalSystem.addVehicle(car);
  rentalSystem.addVehicle(bike1);
  rentalSystem.addVehicle(bike2);
  rentalSystem.addVehicle(car2);
  
  while (true) {
   //Options for the user
   System.out.println();
   System.out.println("===== Vehicle Rental System =====");
   System.out.println("1. Rent a Vehicle");
   System.out.println("2. Return a Vehicle");
   System.out.println("3. Display Available and Rented Vehicles");
   System.out.println("4. Add vehicles");
   System.out.println("5. Remove vehicles");
   System.out.println("6. Exit");
   System.out.println();
   System.out.print("Enter your choice: ");
   
   int choice = scanner.nextInt();
   scanner.nextLine();
   
   switch (choice) {
   case 1: {
    //Rent a vehicle
    System.out.print("Enter the vehicle brand:");
    String make = scanner.nextLine();
    System.out.print("Enter the vehicle model: ");
    String model = scanner.nextLine();
    
    Vehicle selectedVehicle = null;
    
    //Checks the vehicles in available vehicles
    for(Vehicle v : rentalSystem.getAvailableVehicles()) {
     if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
      selectedVehicle = v;
     }
     
    }
    
    if(selectedVehicle != null) {
     //Add the vehicle to rented vehicles
     rentalSystem.rentVehicle(selectedVehicle);
     System.out.print("Enter the rental duration in days: ");
     int rentalDuration = scanner.nextInt();
     //Calculate total rental cost
     double rc = rentalSystem.calculateRentalCost(selectedVehicle, rentalDuration);
     System.out.println("Successfully rented.");
     System.out.println("Total rental Cost: " + rc);
    }
    else {
     System.out.println("Matching vehicle is not available for rent.");
    }
    break;

   }
   
   case 2: {
    //Return a vehicle
    System.out.print("Enter the vehicle brand: ");
    String make = scanner.nextLine();
    System.out.print("Enter the vehicle model: ");
    String model = scanner.nextLine();
    
    Vehicle selectedVehicle = null;
    
    //Checks the vehicles in rented vehicles
    for(Vehicle v : rentalSystem.getRentedVehicles()) {
     if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
      selectedVehicle = v;
     }
    }
    if(selectedVehicle != null) {
     //Add to the returned vehicles
     rentalSystem.returnVehicle(selectedVehicle);
     System.out.println("Vehicle returned successfully.");
    }
    else {
     System.out.println("Invalid return. Vehicle not rented.");
    }
    break;
   }
   
   case 3: {
    System.out.println();
    //Display Rental Information
    rentalSystem.displayRentalInfo();  
    break;
   }
   
    case 4: {
    //Add vehicle 
    System.out.print("Enter the vehicle type( Car / Bike ):");
    String type = scanner.nextLine();
    System.out.print("Enter the vehicle brand:");
    String brand = scanner.nextLine();
    System.out.print("Enter the vehicle model: ");
    String model = scanner.nextLine();
    System.out.print("Enter the year of establishment: ");
    int year = scanner.nextInt();
    System.out.print("Enter the rental rate: ");
    double rate = scanner.nextDouble();

    Vehicle veh;
    if(type.equalsIgnoreCase("car")){
      System.out.print("No. of accomodate persons: ");
      int per=scanner.nextInt();
      scanner.nextLine();
      System.out.print("Fuel Type: ");
      String fuel=scanner.nextLine();

      veh=new Car(type,brand,model,year,rate,per,fuel);
    }
    else{
      scanner.nextLine();
      System.out.print("Enter bike type(Fuel-based / Electric): ");
      String btype=scanner.nextLine();
      veh=new Bike(type,brand,model,year,rate,btype);
    }
    rentalSystem.addVehicle(veh);
    System.out.println("\nVehicle added successfully...");
    break;
   }

   case 5: {
    //Remove a vehicle
    System.out.print("Enter the vehicle brand: ");
    String make = scanner.nextLine();
    System.out.print("Enter the vehicle model: ");
    String model = scanner.nextLine();
    
    Vehicle selectedVehicle = null;
    
    //Checks the vehicles in rented vehicles
    for(Vehicle v : rentalSystem.getAvailableVehicles()) {
     if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
      selectedVehicle = v;
     }
    }
    if(selectedVehicle != null) {
     //Add to the returned vehicles
     rentalSystem.removeVehicle(selectedVehicle);
     System.out.println("Vehicle removed successfully.");
    }
    else {
     System.out.println("There is no vehicle in this brand and model.");
    }
    break;
   }

   case 6: {
    //Exit
     System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
     scanner.close();
     System.exit(0);
   }
   
   default:
    System.out.println("Invalid choice. Please enter valid option...");

   }
  }

 }

}
