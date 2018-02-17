package openkattis.compoundwords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compoundwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        boolean b = true;
        while (b) {
            if (sc.nextLine().isEmpty()) {
                b = false;
            } else {
                String string = sc.next();
                stringList.add(string);
            }
        }
        List<String> result = getWords(stringList);
        for (String s : result){
            System.out.println(s);
        }
    }

    private static List<String> getWords(List<String> stringList) {
        return null;
    }
}
