package task1;

public class Rectangle extends Figure {

    private int side;
    private int diagonal;

    public Rectangle(int side, int diagonal) {
        this.side = side;
        this.diagonal = diagonal;
    }

    public int area() {
        return side * diagonal;
    }
}
