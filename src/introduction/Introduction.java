package introduction;

import java.util.Arrays;

class Student{
        int rNo;
        String name;
        float marks = 85.0f;

        public Student() {
            // this is how you call a constructor from another constructor
            this (25,"Default Name",68.0f);
            // internally: new Student (25,"Default Name",68.0f);
            // this will call the argument constructor

        }
        // Constructor overloading
        public Student (Student other){
            System.out.println("This is constructor taking other object as argument");
            this.name = other.name;
            this.marks = other.marks;
            this.rNo = other.rNo ;
        }

        public Student(int rNo, String name, float marks) {
//                max.rNo = rNo;
//                max.name = name;
//                max.marks = marks;
            // basically this replaces our object 
            this.rNo = rNo;
            this.name = name;
            this.marks = marks;
        }

        void changeName(String name){
                this.name = name;
        }
        void greetings(){
//            System.out.println("Hello my name is "+ name);
            System.out.println("Hello my name is "+ this.name);
        }
    }

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student[]  students = new Student[4];
        Student max;
        max = new Student();
        max.rNo = 12;
        max.name = "Max";
        max.marks = 90.0f;
        System.out.println(max);
        System.out.println(max.marks);
        System.out.println(max.name);
        System.out.println(max.rNo);
//        System.out.println(Arrays.toString(students));
        max.greetings();
//        max.changeName("Drax");
//        max.greetings();
        Student random = new Student(max);
        random.greetings();
        Student random2 = new Student();
        System.out.println(random2.name);

//        Student student2 = new Student(14,"Sam",80.0f);
//        System.out.println(student2.marks);
//        System.out.println(student2.name);
//        System.out.println(student2.rNo);

        Student one = new Student();
        Student two = one;
        one.name = "one";
        System.out.println(two.name); // name of two got changed because both one and two(stored in stack memory) are pointing to same object in heap memory


    }
}












