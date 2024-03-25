package thuchanh;
import thuchanh.Circle;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<ComparatorCircle> {
    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius) {
        super(radius);
    }

    public ComparatorCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compare(ComparatorCircle o1, ComparatorCircle o2) {
        if (o1.getRadius() > o2.getRadius()){return 1;}
        else if (o1.getRadius() < o2.getRadius()) {return -1;}
        else {return 0;}
    }
}
