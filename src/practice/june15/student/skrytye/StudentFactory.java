package practice.june15.student.skrytye;


import practice.june15.student.Student;

/**
 * Created by Student on 15.06.2017.
 */
public class StudentFactory {
    public static Student getStudent(){
        return new MirlanCoolImpl() ;
    }
}
