package AbstractAndInterface.GeometricShapes;

public class Circle extends Shapes{

    public Circle(int radius)
    {
        this.setLine(radius);
    }
    @Override
    public double getArea() {
        return this.getLine() * getLine() * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getLine();
    }
}
