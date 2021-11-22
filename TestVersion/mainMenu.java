import Boss.Boss;
import Customer.Customer;
import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        //Cant call the method withouth the object, needs to be changed
        Customer newCustomer = new Customer("TestUser",0);
        Boss boss = new Boss("Timmie >:)");

        while(menu == true){
            System.out.println("Choose an option: \n1. Boss Menu \n2. Price Rules \n3. Quit the program");
            int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                boss.bossMenu(newCustomer);
            case 2:

            case 3:
              menu = false;
        }
        }
    }

}
