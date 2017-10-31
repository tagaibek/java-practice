package exams.exams2810.sort;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(Time time) {
        hours = time.getHours();
        minutes = time.getMinutes();
        seconds = time.getSeconds();
    }

    public Time(String timeStr) {
        // we split a string by space " "
        String[] split = timeStr.split(" ");

        // and convert them into integers
        hours = Integer.parseInt(split[0]);
        minutes = Integer.parseInt(split[1]);
        seconds = Integer.parseInt(split[2]);
    }



    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }

    @Override
    public String toString() {
        return hours + " " + minutes + " " + seconds;
    }
}
