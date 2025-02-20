import java.util.Scanner;

public class ClassAndObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand of the car:");
        String brand = sc.nextLine();
        System.out.print("Enter model of the car:");
        String model = sc.nextLine();
        System.out.print("Enter launched year:");
        int year = sc.nextInt();
        
        Car obj1 = new Car(brand, model, year);
        obj1.displayInfo();

        sc.close();
    }
}

class Car { // Removed 'public' from here
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}
