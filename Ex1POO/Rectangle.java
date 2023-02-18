package entities;

public class Rectangle {
    public double x;
    public double y;

    public double diagonal() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double perimeter(){
        return 2*(x + y);
    }
    public double area(){
        return x * y;
    }
}
