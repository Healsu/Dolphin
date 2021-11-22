package Boss;
import Customer.Customer;
import Menu.Menu;
import java.util.Scanner;

public class Boss{
    Scanner scanner = new Scanner(System.in);
    public String bossName;
    private boolean bossMenu = true;
    Customer customer;
    Menu menu;

    public Boss(String bossName) {
        this.bossName = bossName;
    }

    public void bossMenu(Customer newCustomer){
        System.out.println("Welcome "+bossName+" what would you like to see?");

        while(bossMenu == true){
            System.out.println("1. Register new user. \n2. Check the teams. \n3. Exit");
            int bossUserInput = scanner.nextInt();
            switch (bossUserInput) {
                case 1:
                    acceptNewUser(newCustomer.newCustomerInfomation());
                case 2:

                case 3:

            }
        }
        //Dont look at true boolean :)
    }

    public boolean acceptNewUser(Object customer){
        System.out.println("New user registered would you like to accept them into the system "+bossName+"?");
        //UserInput doesnt take the input from user, but skips it for some reason.
        String UserInput = scanner.nextLine();
        String RealUserInput = scanner.nextLine();

        if(RealUserInput.equalsIgnoreCase("yes")){
            System.out.println("New user registered");
            return true;
        }
        else if(RealUserInput.equalsIgnoreCase("no")){
            System.out.println("New user deleted");
            return false;
        }
        else{
            System.out.println("Unable to translate input, responding to default which is deleting user");
            return false;
        }
    }

}
