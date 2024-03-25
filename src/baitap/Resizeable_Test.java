package baitap;

public class Resizeable_Test {
    public static void main(String[] args) {
        //Tao array chua 3 doi tuong circle
        Resizeable_shape[] circles = new Resizeable_shape[3];
        circles[0] = new Resizeable_shape(4);
        circles[1] = new Resizeable_shape(5);
        circles[2] = new Resizeable_shape();

        for (Resizeable_shape circle:circles){
            System.out.println(circle.resize(50));
        }
    }
}
