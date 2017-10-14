package practice.june15.student.skrytye;


import practice.june15.student.Human1;
import practice.june15.student.Student;

/**
 * Created by Human on 15.06.2017.
 */
class MirlanCoolImpl implements Student, Human1 {
    public int getAge(){
        return 29;
    }

    public String getName(){
        return "Mirlan";
    }

    public int getGrade(){
        int g = getRealGradeFromSomwhere();
        return g;
    }

    private int getRealGradeFromSomwhere(){
        ///int aslkdfna;lsdnfa
        //Database db = new Database();
        // int grade = db.read("SELECT blablab GRADE from TABLE");

        //return grade;






        int grade = 12;
        return grade;
    }
}
