package acmp.task131;



public class Human {
    private int number;
    private int age;
    private int gender;


    public Human(Human human) {
        number = human.getNumber();
        age = human.getAge();
        gender = human.getGender();
    }

    public Human(String humanStr) {
        // we split a string by space " "
        String[] split = humanStr.split(" ");

        // and convert them into integers
        number = Integer.parseInt(split[0]);
        age = Integer.parseInt(split[1]);
        gender = Integer.parseInt(split[2]);
    }


    public int getNumber(){
        return this.number;
    }
    public int getAge(){
        return this.age;
    }
    public int getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return number + " " + age + " " + gender;
    }
}
