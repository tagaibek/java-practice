package practice.june15homework;

import practice.june15homework.models.Game;
import practice.june15homework.models.Impl.GameFactory;
import practice.june15homework.models.Player;
import practice.june15homework.models.Referee;

/**
 * Created by Human on 17.06.2017.
 */
public class Tournament {
    public static void main(String[] args) {
        Player player1 = GameFactory.createPlayer();
        Player player2 = GameFactory.createPlayer();
        Referee ref = GameFactory.ref;
        ref.giveGameonditions(player1);
        player1.playGame();
        System.out.println("");
        System.out.println("");

        ref.giveGameonditions(player2);
        player2.playGame();



    }
}
