package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(26,"Max");
//        Human twin = new Human(max);  // takes a lot of processing time because of new keyword
        Human clone = max.clone();
        System.out.println("Twin age is "+ clone.age+" and age of max is "+ max.age);
        System.out.println("Twin name is "+ clone.name+" and name of first is "+ max.name);
        System.out.println(Arrays.toString(clone.arr));
        clone.arr[0] = 100;
        System.out.println("After deep copy");
        System.out.println(Arrays.toString(max.arr));
        System.out.println(Arrays.toString(clone.arr));
//        for(int i=0;i<100000000;i++){
//            Human b = new Human(55);
//        }
    }
}
