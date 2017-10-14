package practice.june15homework.models.Impl;

import practice.june15homework.models.Game;
import practice.june15homework.models.Player;
import practice.june15homework.models.Referee;

/**
 * Created by Human on 17.06.2017.
 */
class RefereeImpl implements Referee{
    private String name;

    public RefereeImpl (String name){
        this.name =name;
    }

    public void giveGameonditions(Player player){
        String gameName = (int)(Math.random() * 100) + "";

        GameImpl game = new GameImpl(gameName,"game not started");
        player.takeGameConditions(game);
    }
}

