package singleton;

import access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        A a = new A(45,"Ted",6);
        System.out.println(a.getNum());
//        System.out.println(a.name);
//        String name = a.name; // cannot allow in different package, default one
    }
}
