package thuchanh;

import java.util.Arrays;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        //tao Array chua cac doi tuong Circle
        ComparatorCircle[] circles = new ComparatorCircle[3];
            // tao 3 doi tuong
        circles[0] = new ComparatorCircle(4.5);
        circles[1] = new ComparatorCircle(3);
        circles[2] = new ComparatorCircle();

        System.out.println("Pre-sorted: ");
        for (ComparatorCircle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles, new ComparatorCircle());

        System.out.println("After-sorted: ");
        for (ComparatorCircle c:circles){
            System.out.println(c);
        }
    }
}
