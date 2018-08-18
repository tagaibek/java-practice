package home_tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem19 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1901; i < 2001 ; i++) {
            for (int j = 1; j <= 12; j++) {
                if (LocalDate.of(i, j, 1).getDayOfWeek() == DayOfWeek.SUNDAY) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
