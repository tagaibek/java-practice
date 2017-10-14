package practice.june15.student.skrytye;

import practice.june15.student.Human1;

/**
 * Created by Human on 15.06.2017.
 */
public class Factory {
    public static Human1 getHuman(){
        return new MirlanCoolImpl();
    }
}
