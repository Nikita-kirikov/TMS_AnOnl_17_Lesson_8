package task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(1, 2);
        Triangle triangle = new Triangle(4, 5);

        Figure[] figures = new Figure[5];

        int sum = 0;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new Rectangle(i + 1, i + 1);
            sum += figures[i].area();
        }

        System.out.println(sum);
    }
}
