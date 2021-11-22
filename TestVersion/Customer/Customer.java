package Customer;

import java.util.Random;
import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private int userAge;
    private int ID;
    private boolean isMemberActive;
    private int memberType;

    public Customer(String userName, int userAge, int memberType) {
        this.userName = userName;
        this.userAge = userAge;
        //er isMemberActive nødvendig?
        this.isMemberActive = true;
        this.memberType = memberType;
    }

    public Object newCustomerInfomation() {
        System.out.println("What is the name of the new user?");
        String userName = scanner.nextLine();
        System.out.println("What about their age?");
        int userAge = scanner.nextInt();
        Random random = new Random();
        ID = random.nextInt(1000);
        Customer customer = new Customer(userName, userAge, memberType);
        customer.toString();
        //We want then the new customer class to get to a Boss.Boss method to verify if they want it to be added to the System.Database

        return customer;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", ID=" + ID +
                ", isMemberActive=" + isMemberActive +
                '}';
    }
}
