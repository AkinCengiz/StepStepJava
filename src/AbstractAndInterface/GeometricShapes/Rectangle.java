package AbstractAndInterface.GeometricShapes;

public class Rectangle extends Shapes{
    private int line2;

    public Rectangle(int line, int line2) {
        this.setLine(line);
        this.line2 = line2;
    }

    @Override
    public double getArea() {
        return this.getLine2() * this.getLine();
    }

    @Override
    public double getPerimeter() {
        return this.getLine() * 2 + this.getLine2() * 2;
    }

    public int getLine2() {
        return line2;
    }

    public void setLine2(int line2) {
        this.line2 = line2;
    }
}
