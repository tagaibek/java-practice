package home_tasks;

class Person {
    private String name;
    private int age;
    private float height;

    public Person(String n, int a, float h) {
        this.name = n;
        this.age = a;
        this.height = h;
    }
    public int getAge(){
        return this.age;
    }

    public String toString()
    { return String.format("%-9s %3d %6.2f",
            this.name, this.age, this.height);
    }
}
