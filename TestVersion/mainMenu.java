import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cant call the method withouth the object, needs to be changed
        Customer newCustomer = new Customer("",0);
        Boss boss = new Boss("Timmie >:)");
        System.out.println("Choose an option: \n1. Create new user \n2. Boss Menu \n3. Price Rules \n4. Quit the program");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:

            case 2:
                System.out.println("Welcome "+boss.bossName+" what would you like to see?");

            case 3:

            case 4:
                break;
        }
    }

}
