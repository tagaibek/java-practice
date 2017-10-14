package exams.exam0527;

/**
 * Created by Student on 29.05.2017.
 */
public class FamilyMember {
    private String name;
    private String lastname;
    private int age;


    public FamilyMember(String name,String lastname,int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge(){return this.age;}

    public String getName(){
        return this.name;
    }


    public String getLastname() {
        return this.lastname;
    }
}
