package Teams;
import Customer.Customer;

import java.util.ArrayList;

public class Team {
    private ArrayList<Customer> teamMembers;

    public Team(ArrayList<Customer> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public void addToTeam(Customer swimmer){
        teamMembers.add(swimmer);
    }

    public void checkTeam(){
        for (Customer member: teamMembers ) {
            System.out.println("Name: " + member.getUserName());
            System.out.println("Age: " + member.getUserAge());
        }
    }
}




