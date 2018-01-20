package acmp.codebyteEightQueen;


import java.util.*;

public class EightQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        char[] strings = s.toCharArray();
        for (char j : strings) {
            if (j > 48 && j < 59){
                arrayList.add(String.valueOf(j));
            }
        }
        int a = 0;
        String[] string = new String[arrayList.size()];
        for (String i : arrayList){
            string[a] = i;
            a++;
        }
        String result = getTrue(string);
        System.out.println(result);
    }

    private static String getTrue(String[] strings) {
        int a1 = 0;
        int b1 = 0;
        int a2 = 0;
        int b2 = 0;
        String result = "";
        for (int i = 0; i < strings.length - 1; i++) {
            int a = Integer.parseInt(strings[i]);
            int b = Integer.parseInt(strings[i + 1]);

            if (a != a1 && b !=b1) {
                a1 = a;
                b1 = b;
                i++;
            }
            else if (a2==0 && b2==0){
                a2 = a1;
                b2 = b1;
                i++;
            }
            else if (a2>0){
                result = a2 + "," + b2;
                i++;
            }
            else result = strings[1] + "," + strings[2];



        }

        return result;
    }
}
