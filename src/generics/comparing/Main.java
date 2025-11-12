package generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(4,56.5f);
        Student b = new Student(8,65.5f);
        Student c = new Student(12,85.5f);
        Student d = new Student(2,95.5f);
        Student e = new Student(16,45.5f);
        Student [] list = {a,b,c,d,e};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(a>b){
//            System.out.println("A has more marks");
//        }
        if(a.compareTo(b) >0 ){
            System.out.println(a.compareTo(b));
            System.out.println("A has more marks");
        }
        else{
            System.out.println(a.compareTo(b));
            System.out.println("B has more marks");
        }
    }
}
