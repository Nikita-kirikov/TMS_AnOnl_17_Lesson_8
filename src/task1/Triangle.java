package task1;

public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle( int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getArea() {
        return  0.5f * sideA * sideB;
    }

    public float getPerimeter() {
        return sideA + sideB + sideC;
    }
}
