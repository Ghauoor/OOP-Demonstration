package Methods;

public class Abstract_Method {

}

abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public abstract double area();
}

//Subclass of above Abstract Class
class Square extends Shape {
    private int len;
    private int width;

    public Square(int x, int y, int len, int width) {
        super(x, y);
        this.len = len;
        this.width = width;
    }

    @Override
    public double area() {
        return len * width;
    }
}