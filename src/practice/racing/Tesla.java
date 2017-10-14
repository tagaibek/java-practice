package practice.racing;

/**
 * Created by Student on 10.06.2017.
 */
public class Tesla implements Car {
    private String name;
    private int speed;

    public Tesla(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void accelerate(int speed){
        this.speed = speed;
    }
}