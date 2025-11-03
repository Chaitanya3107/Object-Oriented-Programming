package properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("I am in Box class");
    }

    public double getL() {
        return l;
    }

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.w = w;
        this.l = l;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public  void information(){
        System.out.println("Running the box");
    }
}


















