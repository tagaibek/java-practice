package homeTasks2;

import java.util.Scanner;

public class TrickyPrinting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = solveTricky(sc.nextInt());
        System.out.println(result);
    }

    private static String solveTricky(int number) {
        StringBuilder result = new StringBuilder();
        if (number >= 10){
            int remainder = number % 10;
            int divided = number / 10;
            if (remainder > 0){
                int sumNum = remainder + divided;
                for (int i = 0; i < sumNum; i++){
                    result.append("+");
                    if (i == divided - 1){
                        result.append(" : ");
                    }
                }
                return result.toString();
            }
            else {
                for (int i = 0; i < divided; i++) {
                    result.append("+");
                }
                return result.toString();
            }
        }
        else {
            for (int i = 0; i < number ; i++) {
                if (i == 5){
                    result.append(" ");
                }
                result.append("+");
            }
            return result + " :";
        }
    }
}
