package practice.june15homework.models.Impl;

import practice.june15homework.models.Game;

/**
 * Created by Human on 17.06.2017.
 */
public class GameFactory {
    public  static PlayerImpl createPlayer(){
        String playerName = (int) (Math.random() * 10) + "Player";
        return new PlayerImpl(playerName);
    }

    public static RefereeImpl ref = new RefereeImpl("Mirlan");
}
