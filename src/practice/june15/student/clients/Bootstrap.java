package practice.june15.student.clients;

import practice.june15.student.Human1;
import practice.june15.student.Student;
import practice.june15.student.skrytye.Factory;
import practice.june15.student.skrytye.StudentFactory;

/**
 * Created by Student on 15.06.2017.
 */
public class Bootstrap {
    public static void main(String[] args) {
        Student student = StudentFactory.getStudent();

        System.out.println(student.getName() + " age =  "+ (student.getAge() + 1));

        Human1 human1 = Factory.getHuman();
        System.out.println("human1 = " + human1.getName());
    }
}
