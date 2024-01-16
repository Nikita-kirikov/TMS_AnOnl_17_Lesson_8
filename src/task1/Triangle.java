package task1;

public class Triangle extends Figure {

    private int height;
    private int side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    public int area() {
        return (int) Math.pow(height, 2) * side;
    }
}
