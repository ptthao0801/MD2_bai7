package thuchanh;

interface Edible {
    String howToEat();
}
public abstract class Animal {
    public abstract String makeSound();
}
class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cHICKEN: CLUCK-CLUCK!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

class Tiger extends Animal{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrrr!";
    }
}

abstract class Fruit implements Edible{
}

class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "vat cam";
    }
}

class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "got tao";
    }
}
