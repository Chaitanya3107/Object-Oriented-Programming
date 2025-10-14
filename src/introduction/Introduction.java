package introduction;

import java.util.Arrays;

class Student{
        int rNo;
        String name;
        float marks = 85.0f;

            public Student() {
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
        Student student1;
        student1 = new Student();
        student1.rNo = 12;
        student1.name = "Max";
        student1.marks = 90.0f;
        System.out.println(student1);
        System.out.println(student1.marks);
        System.out.println(student1.name);
        System.out.println(student1.rNo);
//        System.out.println(Arrays.toString(students));
        student1.greetings();
        student1.changeName("Drax");
        student1.greetings();

//        Student student2 = new Student(14,"Sam",80.0f);
//        System.out.println(student2.marks);
//        System.out.println(student2.name);
//        System.out.println(student2.rNo);


    }
}
