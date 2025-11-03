package properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
// method overloading
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(4,5);
        obj.sum(4,5,6);

    }
}
