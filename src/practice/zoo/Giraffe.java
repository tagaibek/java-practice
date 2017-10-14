package practice.zoo;

/**
 * Created by Student on 29.05.2017.
 */
public class Giraffe implements Animal, Vegeterian{
    private String name;
    private int tail;
    private int neck;
    private int age;

    public Giraffe(String name,int tail,int neck){
        this.name = name;
        this.tail = tail;
        this.neck =neck;
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

    public int getNick() {return this.neck;
    }

    public void eats(String grass){
        System.out.println("eating  " + grass + " ... Delicious!");
    }
}
