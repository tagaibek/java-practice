package home_tasks;

public class ForwardBackward {
    public static void main(String[] args) {
        int n = 0;
        double result = f();
    }

    private static double f() {
        long n = 0;
        float sumPrevious = -1;
        float sum = 0.f;

        while(sumPrevious != sum){
            sumPrevious = sum;
            float term = (float) (1 / (1000 * n + Math.PI));
            System.out.println("term[" + n + "]=" + term);
            sum += term;
            System.out.println("sum[" + n + "]=" + sum);

            n++;
        }

        return sum;
    }
}
