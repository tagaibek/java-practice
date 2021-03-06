package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Grade {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        final int n = scan.nextInt();

        final int[] grades = IntStream.range(0, n)
                .map(i -> scan.nextInt())
                .toArray();

        int[] result = gradingStudents(grades);
        System.out.println(Arrays.toString(result));
    }

    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];
        int j = 0;
        for (int i : grades) {
            int grade = i;
            if (grade + 2 >= 40) {
                while (i % 5 != 0) {
                    i++;
                }
                if (i - grade < 3) {
                    result[j] = i;
                } else result[j] = grade;
            } else result[j] = grade;
            j++;
        }
        return result;
    }


}

