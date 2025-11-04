package access;

public class SubClass extends A{

    public SubClass(int num, String name, int x) {
        super(num, name,x);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(3,"A",8);
        int y = obj.x;  // protected can be used in subclass
    }
}
