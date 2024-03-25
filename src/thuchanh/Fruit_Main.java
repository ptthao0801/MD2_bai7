package thuchanh;
import thuchanh.Fruit;
import thuchanh.Orange;
import thuchanh.Apple;

public class Fruit_Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f:fruits){
            System.out.println(f.howToEat());
        }
    }
}
