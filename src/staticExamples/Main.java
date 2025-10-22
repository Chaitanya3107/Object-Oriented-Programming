package staticExamples;

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
// this is not dependent on objects
    static void fun(){
//        greeting(); // you can't use this because it requires instance
//        but the function you are using it in does on depend on instance
//        you cannot access static stuff without referencing their instance in a static context
        Main obj = new Main();
        obj.greeting();
    }

//we know that something which is not static, belongs to an object
    void greeting(){
        fun();
        System.out.println("Greeting");
    }

}
