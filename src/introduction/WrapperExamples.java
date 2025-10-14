package introduction;

public class WrapperExamples {
    public static void main(String[] args) {
        // int is a primitive data type
        int a = 10;
        int b = 20;

        // while when we use Integer, we declare it as object
        Integer num1 = 50; // here num is and object of type Integer
        Integer num2 = 60;
        swap(a,b); // this will not work because java is pass by value, so only value will be changed, no reference will be changed
        swap(num1,num2);  // this will still not swap values, even after object reference is passed because Integer is a final class
        System.out.println("int Number after swap " + a + " " + b);
        System.out.println("Integer Number after swap " + num1 + " " + num2);


        final A max = new A("Max");
        max.name = "other name";
//        when a non primitive is final, you cannot reassign it, you can change the value though
//        max = new A("new object");  this is not allowed

        // testing finalize method for garbage collection
        A obj;
        for(int i=0;i<1000000000;i++){
            obj = new A("Random name");
        }

    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
        // runs when garbage collector deletes object
    }
}
