package inheritance;

public class Circle extends Shape {
    public Circle(Integer circumference, Integer radius, Integer area, Integer diameter, Integer diagonal) {
        super(circumference, radius, area, diameter, diagonal);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.radius = 0;
        shape.area = 0;
        shape.diameter = 0;

    }
}
