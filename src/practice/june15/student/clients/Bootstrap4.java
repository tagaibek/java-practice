package practice.june15.student.clients;


import practice.june15.student.Student;
import practice.june15.student.skrytye.StudentFactory;

/**
 * Created by Human on 15.06.2017.
 */
public class Bootstrap4 {
    public static void main(String[] args) {
        Student student = StudentFactory.getStudent();

        System.out.println("Bootstrap4: " + student.getName() + " age = " + student.getAge());
    }
}
