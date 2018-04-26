package codeabbey;




import java.io.IOException;
import java.util.*;

public class RotateString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //using Map<Integer,String> would simplify this
        Map<Integer,String> map = new HashMap<>();

        for (int i = 0; i < num ; i++){

            map.put(sc.nextInt(),sc.next());
        }

        List<String> result = getString(map);
        System.out.println("answer:");
        for (String i : result) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }


    private static List<String> getString(Map<Integer,String> map) {
        List<String> newStrings = new ArrayList<>();

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            char[] chars = entry.getValue().toCharArray();
            char[] newChars = new char[chars.length];

            int length = chars.length;
            int step = entry.getKey();
            if (step > 0){
                for(int j = 0; j < length; j++){
                    if(j < step){
                        newChars[length + j - step] = chars[j];
                    } else {
                        newChars[j - step] = chars[j];
                    }
                }
                newStrings.add(new String(newChars));
            }

            else if (step < 0){
                step = (-1 * step);
                int step1 = length - step;
                int m = 0;
                for(int j = 0; j < length; j++){
                    if(j > step1 - 1){
                        newChars[m++ ] = chars[j];
                    } else {
                        newChars[step + j] = chars[j];
                    }
                }
                newStrings.add(new String(newChars));
            }

        }
        return newStrings;
    }
}

