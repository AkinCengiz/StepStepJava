package AbstractAndInterface.GeometricShapes;

public class GeometricTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(5,10);
        Circle circle = new Circle(10);

        Shapes square2 = new Square(20);
        Shapes rectangle2 = new Rectangle(20,10);
        Shapes circle2 = new Circle(20);

        System.out.println("Karenin çevresi\t: " + square.getPerimeter()+"\nKarenin alanı\t: " + square.getArea());
        System.out.println("Dikdörtgenin çevresi\t: " + rectangle.getPerimeter()+"\nDikdörtgenin alanı\t: " + rectangle.getArea());
        System.out.println("Dairenin çevresi\t: " + circle.getPerimeter()+"\nDairenin alanı\t: " + circle.getArea());
        System.out.println("***********************************");
        System.out.println("Karenin çevresi\t: " + square2.getPerimeter()+"\nKarenin alanı\t: " + square2.getArea());
        System.out.println("Dikdörtgenin çevresi\t: " + rectangle2.getPerimeter()+"\nDikdörtgenin alanı\t: " + rectangle2.getArea());
        System.out.println("Dairenin çevresi\t: " + circle2.getPerimeter()+"\nDairenin alanı\t: " + circle2.getArea());

    }
}
