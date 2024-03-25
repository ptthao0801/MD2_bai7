package baitap;

interface Resizeable<R> {
    double resize(double percent);
}
public class Resizeable_shape extends Circle implements Resizeable<Resizeable_shape>{
    public Resizeable_shape() {
    }

    public Resizeable_shape(double radius) {
        super(radius);
    }

    public Resizeable_shape(double width, double length, double radius) {
        super(width, length, radius);
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent/100 + getArea();
    }
}
