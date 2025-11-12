package generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
//        return rollno + "";
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff == 0, same marks
        // if diff<0, means, o is bigger, otherwise o is smaller
        return diff;
    }
}
