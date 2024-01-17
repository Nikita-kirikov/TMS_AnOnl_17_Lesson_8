package task1;

public class Circle extends Figure {
    private final float PI = 3.14f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) Math.pow(radius, 2) * PI;
    }

    public float getPerimeter() {
        return 2 * PI * radius;
    }
}
