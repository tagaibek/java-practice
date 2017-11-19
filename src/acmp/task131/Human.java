package acmp.task131;



public class Human {
    private int line;
    private int age;
    private int gender;


    public Human(Human human) {
        line = human.getLine();
        age = human.getAge();
        gender = human.getGender();
    }

    public Human(String humanStr, int lineNumber) {
        // we split a string by space " "
        String[] split = humanStr.split(" ");

        // and convert them into integers
        line = lineNumber;
        age = Integer.parseInt(split[0]);
        gender = Integer.parseInt(split[1]);
    }


    public int getLine(){
        return this.line;
    }
    public int getAge(){
        return this.age;
    }
    public int getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return line + " " + age + " " + gender;
    }
}
