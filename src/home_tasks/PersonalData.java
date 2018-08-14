package home_tasks;


public class PersonalData {
    public static void main(String[] args) {
        Person[] p = {new Person("George", 34, 1.71f),
                new Person("Betty", 22, 1.76f),
                new Person("Charles", 24, 1.79f),
                new Person("Hanna", 29, 1.66f),
                new Person("Edward", 23, 1.82f),
                new Person("Frida", 28, 1.77f),
                new Person("Davina", 33, 1.69f),
                new Person("Andrew", 25, 1.67f)};
        sortAge(p);

    }

    private static void sortAge(Person[] p) {
        Person[] people = new Person[p.length];
        for (int j = 0; j < people.length; j++) {
            int index = 0;
            int age = 100;
            for (int i = 0; i < p.length; i++) {
                if (p[i] == null)continue;
                if (p[i].getAge() < age){
                    age = p[i].getAge();
                    index = i;
                }
            }
            people[j] = p[index];
            p[index] = null;
        }
        for (Person i : people) {
            System.out.printf("%s%n", i);
        }
    }
}
