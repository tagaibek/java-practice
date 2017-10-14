package practice.zoo;

/**
 * Created by Student on 29.05.2017.
 */
public class Rabbit implements Animal,Vegeterian {
    private String name;
    private int tail;
    private int paw;
    private int age;

    public Rabbit(String name,int tail,int paw){
        this.name = name;
        this.tail = tail;
        this.paw =paw;
    }
    public int getTail(){return this.tail;}

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public int getAge(){
        return this.age;
    }

    public int getPaw() {
        return this.paw;
    }
    public void eats(String grass){
        System.out.println("Кушает "+ grass+ " апетитно...");
    }
}
