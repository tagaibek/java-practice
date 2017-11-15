package acmp.task633;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String teamName;
    private String firstName;
    private String secondName;
    private String thirdName;

    public Team(Team team) {
        teamName = team.getTeamName();
        firstName = team.getFirstName();
        secondName = team.getSecondName();
        thirdName = team.getThirdName();
    }

    public Team (String teamStr){
        String[] s = teamStr.split(" ");
        teamName  = s[0]+" "+s[1];

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(s));
        arrayList.remove(0);
        arrayList.remove(0);
        String[] arr = arrayList.toArray(new String[arrayList.size()]);
        Arrays.sort(arr);
        firstName = arr[0];
        secondName = arr[1];
        thirdName = arr[2];
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getThirdName() {
        return this.thirdName;
    }
}
