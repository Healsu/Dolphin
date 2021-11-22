package Teams;
import Customer.Customer;

import java.util.ArrayList;

public class Team {
    private String swimDisciplin;
    private int ageGroup;
    private ArrayList<Customer> teamMembers;


    private int adultAge = 18;


    public void ageGroupIdentifier(){
        int ageGroup = this.ageGroup;
        if(ageGroup >= adultAge){
            System.out.println("Over 18 group");
        } else {
            System.out.println("Under 18 group");
        }
    }

    public void addToTeam(Customer userAge){
        if (userAge.getUserAge() >= adultAge){

        } {

        }
    }
}




