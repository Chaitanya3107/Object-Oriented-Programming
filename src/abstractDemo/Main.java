package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.partner();
        son.normal();
        Daughter daughter = new Daughter(30);
        Parent daughter1 = new Daughter(30);
        daughter.career();
        daughter1.career();
        daughter.partner();
        daughter1.partner();
        daughter.normal();
//        Parent parent = new Parent(); cannot create object of Abstract class
        Parent.hello(); // calling static method

    }
}
