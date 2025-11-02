package properties.inheritance;

public class BoxPrice extends BoxWeights{
    double price;

    public BoxPrice(double price) {
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
