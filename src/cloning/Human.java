package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int [] arr;

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {1,2,3,4,5};
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being deleted");
        super.finalize();
    }

//    @Override
//    public Human clone() {
//        // this is shallow copy
//        try {
//            Human clone = (Human) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    public Human clone() {
        // this is deep copy
        try {
            Human clone = (Human) super.clone();// this is actually shallow copy
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.arr = new int[clone.arr.length];
            for(int i=0;i<clone.arr.length;i++){
                clone.arr[i] = this.arr[i];
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
