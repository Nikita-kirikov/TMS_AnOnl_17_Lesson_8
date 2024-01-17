package task1;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getArea() {
        return sideA * sideB;
    }

    public float getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
