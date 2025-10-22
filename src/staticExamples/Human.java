package staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // static variable used when property is not related to object
    // static variables are not dependent on object, they can be accessed without creating object of a class

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }

} 
