package properties.inheritance;

import java.util.function.DoubleToIntFunction;

public class BoxWeights extends Box {
    double weight;

    public BoxWeights() {
        this.weight = -1;
    }

    public BoxWeights(BoxWeights other){
        super(other);
        weight = other.weight;
    }

    public BoxWeights(double l, double h, double w, double weight) {
        // used to initialized values in parent class
        super(l, h, w); // call the parent class constructor
        System.out.println(super.h);
        System.out.println("BoxWeights class constructor");
        this.weight = weight;
//        super(l, h, w); this need to be initialized before BoxWeight class members
    }
}
