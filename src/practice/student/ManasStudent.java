package practice.student;

/**
 * Created by Student on 10.06.2017.
 */
public class ManasStudent implements First{
    private String name;
    private int assessments;

    public ManasStudent(String name,int assessments){
        this.name = name;
        this.assessments = assessments;
    }

    public String getName(){
        return this.name;
    }

    public int  getAssessments(){
        return this.assessments;
    }
}
