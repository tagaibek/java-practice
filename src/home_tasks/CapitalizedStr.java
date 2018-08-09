package home_tasks;

import java.util.Scanner;

public class CapitalizedStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        for (String i : strings) {
            System.out.print(i.substring(0, 1).toUpperCase() + i.substring(1) + " ");
        }
        System.out.println(" ");
    }
}
