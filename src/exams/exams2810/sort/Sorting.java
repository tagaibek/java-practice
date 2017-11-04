package exams.exams2810.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Time> timeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String timeStr = reader.readLine();
            Time time = new Time(timeStr);
            timeList.add(time);
        }
        for (int i = 0; i < timeList.size(); i++) {
            for (int j = 0; j < timeList.size(); j ++) {
                Time iTime = timeList.get(i);
                Time jTime = timeList.get(j);
                if (iTime.getHours() < jTime.getHours()) {
                    swap(timeList, i, j, iTime, jTime);


                } else if (iTime.getHours() == jTime.getHours() && iTime.getMinutes() < jTime.getMinutes()) {
                    swap(timeList, i, j, iTime, jTime);


                } else if (iTime.getHours() == jTime.getHours() && iTime.getMinutes() == jTime.getMinutes()
                        && iTime.getSeconds() < jTime.getSeconds()) {
                    swap(timeList, i, j, iTime, jTime);
                }
            }
        }

        for (Time time : timeList) {
            System.out.println(time);
        }


    }
    private static void swap(List<Time> timeList, int i, int j, Time iTime, Time jTime) {
        Time tempTime = new Time(iTime);
        timeList.set(i, jTime);
        timeList.set(j, tempTime);
    }
}
