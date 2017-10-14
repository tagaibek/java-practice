package practice.june15homework.models.Impl;
import practice.june15homework.models.Game;
import practice.june15homework.models.Player;

/**
 * Created by Human on 17.06.2017.
 */
class PlayerImpl implements Player {
    private String name;
    private Game game;

    public PlayerImpl(String name){this.name = name;}

    public String getName(){
        return this.name;
    }

    public void takeGameConditions(Game game){
        this.game = game;
    }

    public void playGame(){
        System.out.println(getName() + " starting my game");
        System.out.println("game=" + game.getName() + ". initial status = " + game.getStatus());
        System.out.println("playing a game=" + game.getName() + "...");

        this.game.setStatus("completed");

        System.out.println("game=" + game.getName() + ". latest status = " + game.getStatus());
        System.out.println(getName() + " ending my game");;
    }
}
