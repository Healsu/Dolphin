import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private int userAge;

    public Customer(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public Object newCustomerInfomation() {
        System.out.println("What is the name of the new user?");
        String userName = scanner.nextLine();
        System.out.println("What about their age?");
        int userAge = scanner.nextInt();
        Customer customer = new Customer(userName, userAge);

        //We want then the new customer class to get to a Boss method to verify if they want it to be added to the Database

        return customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
