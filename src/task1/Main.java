package task1;
/*
Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
 */
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
