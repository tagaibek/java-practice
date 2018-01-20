package acmp.projecteuler12;


public class TriangularNumber {
    public static void main(String[] args) {
        int count = 0;
        int x = 0 ;
        int i = 0;
        while (count < 500){
            i++;
            x = (i + 1)* i / 2;
            for (int j = 1; j <=x ;j++){
                if (x % j ==0){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(x);

    }
}
