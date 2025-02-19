// Customer.java
public class Customer {
    protected String name;
    protected String contact;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact: " + contact);
    }
}
