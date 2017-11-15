package acmp.problem1;


public class Multiples {
    public static void main(String[] args) {
        int hun = 1000;
        int sum = 0;
        for (int i = 3; i <=hun; i++){
            if (i % 5 == 0 || i % 3==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

}
