package inheritance;

/*
Create a Shape class
a) Add fields , create constructor , getters and setters
b) Create classes Rectangle and Circle . Both of them should inherit class Shape.
Which fields and methods are common
 */

public class Shape {
    public Integer circumference;
    public Integer radius;
    public Integer area;
    public Integer diameter;
    public Integer diagonal;

    public Shape(Integer circumference, Integer radius, Integer area, Integer diameter, Integer diagonal) {
        this.circumference = circumference;
        this.radius = radius;
        this.area = area;
        this.diameter = diameter;
        this.diagonal = diagonal;
    }

    public Shape() {

    }

    public Integer getCircumference() {
        return circumference;
    }

    public void setCircumference(Integer circumference) {
        this.circumference = circumference;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    // looking two classes to find similaritis.
    public abstract class ShapeClass {
        public Integer circumference;
        public Integer radius;
        public Integer area;
        public Integer diameter;
        public Integer diagonal;

    //    @Override
        public boolean equals(ShapeClass other)  {
            return this.circumference == other.circumference &&
                    this.radius.equals(other.radius) &&
                    this.area.equals(other.area) &&
                    this.diameter.equals(other.diameter) &&
                    this.diagonal.equals(other.diagonal);
        }
    }

  /*  Class Circle a  = new Class Circle();
    Class Rectangle b = new Class Rectangle();
    a.equals(b)   */
}
