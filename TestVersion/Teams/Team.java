package Teams;


public class Team {
    private String swimDisciplin;
    private int ageGroup;


    public void ageGroupIdentifier(){
        int ageGroup = this.ageGroup;
        int adultAge = 18;
        if(ageGroup >= adultAge){
            System.out.println("Over 18 group");
        } else {
            System.out.println("Under 18 group");
        }
    }
}




