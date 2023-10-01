import user.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Parking System!");

        Customer customer = new Customer("Shyam");
        customer.performParkingAndPayment();
    }
}