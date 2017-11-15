package acmp.task131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Census {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Human> humans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String humanStr = reader.readLine();
            Human human = new Human(humanStr);
            humans.add(human);
        }
        int age = 0;
        int number = 0;
        int num = 0;
        for (int i = 0; i<humans.size();i++){
            Human iHuman = humans.get(i);
            if (iHuman.getGender()==1){
                if (iHuman.getAge() >= age){
                    age=iHuman.getAge();
                    number = number <= iHuman.getNumber() ? number : iHuman.getNumber() ;
                }
            }
        }
        if (number > 0){
            System.out.println(number);
        }
        else System.out.println("-1");
    }
}
