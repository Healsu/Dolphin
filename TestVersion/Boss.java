import java.util.Scanner;

public class Boss {
    Scanner scanner = new Scanner(System.in);
    public String bossName;

    public Boss(String bossName) {
        this.bossName = bossName;
    }

    public boolean acceptNewUser(Object customer){
        System.out.println("New user registered would you like to accept them into the system "+bossName+"?");
        String userInput = scanner.nextLine();

        if(userInput.equalsIgnoreCase("yes")){
            return true;
        }
        else if(userInput.equalsIgnoreCase("no")){
            return false;
        }
        else{
            return false;
        }
    }

}
