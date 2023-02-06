package ClassTrials;

public class Circle {
    /*
        CemberDaire isimli sınıf oluşturun. Bu sınıfın yarıçap alan kurucusu
        olmalı.Ayrıca cevre ve alanını hesaplayan metotlar olmalı.

     */
    private double radius;
    public final static double PI = 3.14;


    public Circle()
    {
        this(1);
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double areaCalculate()
    {
        return this.radius * this.radius * PI;
    }

    public double perimeterCalculate()
    {
        return this.radius * 2 * PI;
    }

}
