package practice.racing;

import java.util.List;

/**
 * Created by Student on 10.06.2017.
 */
public class GrandTour {
    public static void main(String[] args) {
        List<Car> cars  = Helper.getCars();

        for (Car car : cars){
            System.out.println("Name "+car.getName()+ ", speed= " + car.getSpeed());
            if (car instanceof Buggati ){
                car.accelerate(300);
            }
            if (car instanceof Ferrari){
                car.accelerate(160);
            }
            if (car instanceof Tesla){
                car.accelerate(400);
            }
        }

        printWinner(cars);
    }

    public static void printWinner(List<Car> cars){
        Car winner = null;
        for (Car car :cars){
            if (winner == null || car.getSpeed() > winner.getSpeed()){
                winner = car;
            }
        }


        System.out.println("Winner is " + winner.getName() + ", speed = "+ winner.getSpeed());
    }
}
