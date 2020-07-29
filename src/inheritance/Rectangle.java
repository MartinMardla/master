package inheritance;

public class Rectangle extends Shape {
    public Rectangle(Integer circumference, Integer radius, Integer area, Integer diameter, Integer diagonal) {
        super(circumference, radius, area, diameter, diagonal);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.circumference = 0;
        shape.area = 0;
        shape.diagonal = 0;
    }
}