package Teams;
import Customer.Customer;

import java.util.ArrayList;

public class Team {
    private String swimDisciplin;
    private String ageCategory;
    private ArrayList<Customer> teamMembers;


    private int ageGroupThreshold = 18;

    public void ageGroupIdentifier(){
        int ageGroup = this.ageGroupThreshold;
        if(ageGroup >= ageGroupThreshold){
            System.out.println("Over 18 group");
        } else {
            System.out.println("Under 18 group");
        }
    }

    public void addToTeam(Customer swimmer){
        if (swimmer.getUserAge() >= ageGroupThreshold){
            teamMembers.add(swimmer);
        } {
            teamMembers.add(swimmer);
        }
    }

    public void checkTeam(){
        System.out.println("Disciplin: " +swimDisciplin);
        System.out.println("Age group: " + ageCategory);
        for (Customer member: teamMembers ) {
            System.out.println("Name: " + member.getUserName());
            System.out.println("Age: " + member.getUserAge());
        }
    }
}




