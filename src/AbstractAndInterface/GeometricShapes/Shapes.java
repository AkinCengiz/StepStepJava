package AbstractAndInterface.GeometricShapes;

abstract class Shapes {
    private int line;

    abstract public double getArea();
    abstract public double getPerimeter();


    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
