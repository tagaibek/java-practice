package practice.oct28_17;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("corolla",2015);
        Mercedes mercedes = new Mercedes("maybach",1999);
    }
    public static  <A extends Car> A getThisObj(A e){
        return e;
    }
}
