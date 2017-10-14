package practice.zoo;

/**
 * Created by Student on 29.05.2017.
 */
public class Lion implements Animal,Predator{
    private String name;
    private int weight;
    private int age;

    public Lion(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age =age;
    }
    public int getAge(){return this.age;}

    public String getName(){
        return this.name;
    }


    public int getWeight() {
        return this.weight;
    }
    public void eats(Animal animal){
        System.out.println("Кушает " + animal.getName()+" апетитно..");
    }
}
