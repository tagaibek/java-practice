package practice.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 10.06.2017.
 */
public class Winner {
    public static void main(String[] args)
    {
        ManasStudent manasStudent = new ManasStudent("Asan",60);
        ManasStudent manasStudent1 = new ManasStudent("Esen",80);
        AucaStudent aucaStudent = new AucaStudent("Igor",90);
        AucaStudent aucaStudent1 = new AucaStudent("Svena",50);
        SlavicStudent slavicStudent = new SlavicStudent("Vanya",55);
        SlavicStudent slavicStudent1 = new SlavicStudent("Olga",100);


        List<First> firsts = new ArrayList<>();
        firsts.add(manasStudent);
        firsts.add(manasStudent1);
        firsts.add(aucaStudent);
        firsts.add(aucaStudent1);
        firsts.add(slavicStudent);
        firsts.add(slavicStudent1);

        printWinner(firsts);
    }

    public static void printWinner(List<First> firstList){
        First winner = null;
        for (First first:firstList){
            if (winner == null || first.getAssessments()>winner.getAssessments()){
                winner =first;
            }
        }
        System.out.println("Winner is " +winner.getName()+", assessments= " + winner.getAssessments() + "class is "+ winner.getClass() );
    }
}
