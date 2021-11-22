package Boss;
import Customer.Customer;
import java.util.Scanner;

public class Boss{
    Scanner scanner = new Scanner(System.in);
    public String bossName;
    private boolean bossMenu = true;
    Customer customer;

    public Boss(String bossName) {
        this.bossName = bossName;
    }

    public void bossMenu(Customer newCustomer){
        System.out.println("Welcome "+bossName+" what would you like to see?");

        while(bossMenu = true){
            System.out.println("1. Register new user. \n2. Check the teams. \n3. Exit");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    acceptNewUser(newCustomer.newCustomerInfomation());
                case 2:

                case 3:
                    bossMenu = false;
            }
        }

    }

    public boolean acceptNewUser(Object customer){
        System.out.println("New user registered would you like to accept them into the system "+bossName+"?");
        String userInput = scanner.nextLine();

        if(userInput.equalsIgnoreCase("yes")){
            System.out.println("New user registered");
            return true;
        }
        else if(userInput.equalsIgnoreCase("no")){
            System.out.println("New user deleted");
            return false;
        }
        else{
            System.out.println("Unable to translate input, respond with deleting new user");
            return false;
        }
    }

}
