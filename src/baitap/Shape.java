package baitap;

public class Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Shape() {
    }

    public Shape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
class Circle extends Shape {
    double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double width, double length, double radius) {
        super(width, length);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}

class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }
    public double getArea(){
        return getWidth()*getLength();
    }
}

class Square extends Shape{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
       return getWidth();
    }

    public void setSide(double side){
         setWidth(side);
         setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    public double getArea(){
        return getWidth()*getWidth();
    }
}
