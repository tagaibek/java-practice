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

        int line = 1;
        for (int i = 0; i < n; i++) {
            String humanStr = reader.readLine();
            Human human = new Human(humanStr, line);
            humans.add(human);
            line++;
        }
        Human h = null;
        for (Human iHuman : humans) {
            if (iHuman.getGender() == 1 && (h == null || iHuman.getAge() > h.getAge())) {
                h = iHuman;
            }
        }

        System.out.println(h != null ? h.getLine() : "-1");
    }
}
