package homeTasks2;

import java.util.Scanner;

public class ModularCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2;
        while (true){
            String s = sc.next();
            num2 = sc.nextInt();
            if (s.equals("%")){
                break;
            }
            else if (s.equals("*")){
                num = num * num2;
            }
            else num = num + num2;
        }
        System.out.println(num % num2);
    }
}
