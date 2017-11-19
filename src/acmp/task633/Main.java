package acmp.task633;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[4] ;
        for (int i = 0; i <=3 ;i++){
            String string =reader.readLine();
            strings[i] = string;
        }
        Team teams = new Team(strings);
        String result = (teams.getTeamName()+": " +teams.getFirstName()+", " + teams.getSecondName()+", "+ teams.getThirdName());
        System.out.println(result);
    }
}
