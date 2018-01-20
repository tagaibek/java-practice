package acmp.projecteuler12;


public class Sum100 {
    public static void main(String[] args) {
        int s = 0;
        int i = 0;
        while (s < 100){
            i++;
            s = s + i;
        }

        System.out.println(i);
    }
}
