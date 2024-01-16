package task1;

public class Circle extends Figure {
    final float PI = 3.14f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (int) Math.pow(radius, 2);
    }
}
