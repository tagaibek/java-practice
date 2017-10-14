package practice.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 29.05.2017.
 */
public class Zoo {
    public static void main(String[] args)
    {
        Lion lion = new Lion("Alex",150,26);
        Rabbit rabbit =new Rabbit("Djudi",10,20);
        rabbit.setAge(3);

        Giraffe giraffe = new Giraffe("Melman",30,300);
        giraffe.setAge(15);

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(rabbit);
        animals.add(giraffe);

        for(Animal animal:animals){
            if(animal instanceof Vegeterian){
                System.out.println(animal.getName() + " is vegeterian and age=" + animal.getAge());

                Vegeterian veggie =  ((Vegeterian) animal);

                System.out.print(animal.getName() + " ");
                veggie.eats("green fresh grass");
            }
            if (animal instanceof Predator){
                System.out.println(animal.getName() + " is predator and age=" + animal.getAge());

                Predator predator = (Predator) animal;
                System.out.print(animal.getName() + " ");
                predator.eats(rabbit);
            }
        }
    }

}
