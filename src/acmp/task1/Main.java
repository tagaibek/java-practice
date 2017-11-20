package acmp.task1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main { //имя класса должно быть Main
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }

    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt(), b = sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        pw.print(a + b);
        pw.close();
    }
}