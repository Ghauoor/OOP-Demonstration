package Methods;

public class Instance_Methods {
    Rectangle rectangle = new Rectangle(5, 3);
    int area = rectangle.area();
}

class Rectangle {
    private int len;
    private int width;

    public Rectangle(int len, int width) {
        this.len = len;
        this.width = width;
    }

    public int area() {
        return len * width;
    }
}
