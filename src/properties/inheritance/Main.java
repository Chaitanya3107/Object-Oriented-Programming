package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4,5,6);
        Box box2 = new Box(box1);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeights box3 = new BoxWeights();
        BoxWeights box4 = new BoxWeights(2,3,4,5);
        System.out.println(box3.weight + " " + box3.h);

        Box box5 = new BoxWeights(4,5,6,8); // can only access members of Box class
        System.out.println(box5.h);
        BoxWeights box6 = new BoxWeights(2,3,4,5);

//        System.out.println(box5.weight);
//        there are many variables in both parent and child classes
//        you are given access to variables that are  in the ref type i.e, BoxWeights
//        this also means that ones you are trying to access should be initialized
//        but here when obj itself is of type parent class then how will you call the constructor of child class
//        BoxWeights box6 = new Box(4,5,6,7); error


        BoxPrice box8 = new BoxPrice(1,2,3,4,5);
        BoxWeights box9 = new BoxPrice(1,2,3,4,5);


    }
}
