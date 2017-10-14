package practice.june15.student.skrytye;


import practice.june15.student.Student;

/**
 * Created by Human on 15.06.2017.
 */
class MockStoduent implements Student {
    public String getName(){
        return "Mock";
    }
    public int getAge(){
        return 30;
    }
    public int getGrade(){
        return 12;
    }
}
