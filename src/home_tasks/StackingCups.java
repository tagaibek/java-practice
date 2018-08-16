package home_tasks;

import java.util.*;

public class StackingCups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            while (s.isEmpty()) {
                s = sc.nextLine();
            }
            strings[i] = s;
        }
        String[] result  = stack(strings);
        System.out.println(result);
    }

    private static String[] stack(String[] strings) {
        String[] result= new String[strings.length];
        Map<Integer,String> map = new HashMap<>();
        for (String s : strings) {
            String[] s1 = s.split(" ");
            try {
                map.put((Integer.parseInt(s1[0])),s1[1]);

            }
            catch (NumberFormatException nfe){
                map.put((Integer.parseInt(s1[1]) * 2 ),s1[0]);
            }
        }
        System.out.println(map.toString());
        Map<Integer, String> treeMap = new TreeMap<>(map);
        String s =  "";
        for (int i = 0; i < result.length ; i++) {
            if (!Objects.equals((String) treeMap.values().toArray()[i], s)){
                result[i] = (String) treeMap.values().toArray()[i];
                s = (String) treeMap.values().toArray()[i];
            }
            else result[i] = "none";
        }
        return result;
    }
}
