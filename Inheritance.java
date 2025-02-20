
import java.util.Scanner;

class Animal{
    String name;
    String species;
    public Animal(String name,String species){
        this.name=name;
        this.species=species;
    }
    public void speak(){
        System.out.println("\nCreated sound from the Animal....");
    }
}

class Dog extends Animal{
    //String breed;
    public Dog(String name,String species){
     super(name, species);
     //this.breed=breed;
    }
    @Override
    public void speak(){
        System.out.println("\nDog barks...");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter animal name:");
        String ani_name =sc.nextLine();
        System.out.print("Enter animal species:");
        String ani_spec =sc.nextLine();
        System.out.print("Enter dog name:");
        String dog_name =sc.nextLine();
        System.out.print("Enter dog species:");
        String dog_spec =sc.nextLine();
        Animal ani_obj = new Animal(ani_name,ani_spec);
        Animal dog_obj = new Dog(dog_name,dog_spec);
        ani_obj.speak();
        dog_obj.speak();
        sc.close();
    }
}
