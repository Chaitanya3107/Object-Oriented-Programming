package access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num  ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(54,8.5f);
        ObjectDemo obj2 = new ObjectDemo(54,7.5f);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        if(obj1 == obj2){
            System.out.println("obj1 is less than obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is less than obj2");
        }
    }

}
