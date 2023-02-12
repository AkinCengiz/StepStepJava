package AbstractAndInterface.GeometricShapes;

public class Square extends Shapes{

    public Square(int line)
    {
        this.setLine(line);
    }
    @Override
    public double getArea() {
        return this.getLine() * this.getLine();
    }

    @Override
    public double getPerimeter() {
        return getLine() * 4;
    }
}
