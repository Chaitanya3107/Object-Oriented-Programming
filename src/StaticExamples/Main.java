package StaticExamples;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(28,"Max",20000,true);
        Human drax = new Human(24,"Drax",15000,false);
        Human rex = new Human(26,"Rex",10000,true);
//        System.out.println(max.population); // do it using class name
//        System.out.println(drax.population);
//        System.out.println(rex.population);
        System.out.println(Human.population);

    }
}
