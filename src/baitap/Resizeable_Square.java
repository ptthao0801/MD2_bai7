package baitap;
import baitap.Square;
public class Resizeable_Square extends Square implements Resizeable {
    public Resizeable_Square() {
    }

    public Resizeable_Square(double side) {
        super(side);
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent/100 + getArea();
    }
}
