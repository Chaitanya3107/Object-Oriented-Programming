package staticExamples;
// class Test{
//   static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
public class InnerClass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Max");
        Test b= new Test("Drax");
        System.out.println(a.name);
        System.out.println(b.name);
        // object is printed because of toString() method in defined
        System.out.println(a);
        System.out.println(b);
    }
}
