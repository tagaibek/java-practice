package practice.oct28_17;

public class    Mercedes extends Toyota implements Car {
    private String model;
    private int year;

    public Mercedes (String model,int year){
        super(model, year);
        this.model= model;
        this.year = year;
    }
    @Override
    public String getModel() {
        return "Mercedes " + model ;
    }

    @Override
    public int getYear() {
        return year;
    }
}
