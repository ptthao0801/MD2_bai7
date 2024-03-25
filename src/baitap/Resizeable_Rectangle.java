package baitap;
import baitap.Rectangle;

public class Resizeable_Rectangle extends Rectangle implements Resizeable<Resizeable_Rectangle> {
    public Resizeable_Rectangle() {
    }

    public Resizeable_Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent/100 + getArea();
    }
}
