package practice.student;

/**
 * Created by Student on 10.06.2017.
 */
public class SlavicStudent implements First {
    private String name;
    private int assessments;


    public SlavicStudent(String name,int assessments){
        this.name = name;
        this.assessments = assessments;
    }

    public String getName(){
        return this.name;
    }
    public int getAssessments(){
        return this.assessments;
    }
}
