package exams.exam0527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Student on 27.05.2017.
 */
public class FamilyMap0527 {
    public static void main(String[] args) throws IOException {
       HashMap<String,FamilyMember> map = new HashMap<>();
       map.put("ata", new FamilyMember("Tagaibek","Azizov",1961));
       map.put("apa", new FamilyMember("Uriyathan", "Radjapova",1964));
       map.put("eje",new FamilyMember("Cholpon","Tagaibek kyzy",1986));
       map.put("aka",new FamilyMember("Miki","Tagaibek uulu",1988));
       map.put("uka1", new FamilyMember("Edil","Tagaibekov",1991));
       map.put("uka2", new FamilyMember("Ady" ,"Tagaibek uulu",1993));
       map.put("karyndash", new FamilyMember("Akzyinat","Azizova",2000));

       String key = readKey();

        FamilyMember member = map.get(key);
        System.out.println(member.getName() + " " + member.getLastname() + " " + member.getAge());
    }

    private static String readKey() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}




















