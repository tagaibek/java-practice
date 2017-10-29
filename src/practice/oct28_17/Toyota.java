package practice.oct28_17;

public class Toyota implements Car {
    private String model;
    private int year;

    public Toyota(String model,int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public String getModel() {
        return "toyota " + model;
    }


    @Override
    public int getYear() {
        return year;
    }

    public String getColor(){
        return "red";
    }
}
