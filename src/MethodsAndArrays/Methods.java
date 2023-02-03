package MethodsAndArrays;

public class Methods {

    public static void main(String[] args) {
        System.out.println(Methods.Added(3,5));
        System.out.println(Methods.Added(3,5,7));
        System.out.println(Methods.Added(3.5,5.2));
        System.out.println(Methods.Added(0.3,5.4,2.1));
    }
    public static int Added(int a, int b)
    {
        return a + b;
    }
    public static int Added(int a, int b, int c)
    {
        return a + b + c;
    }
    public static double Added(double a, double b)
    {
        return a + b;
    }
    public static double Added(double a, double b, double c)
    {
        return a + b +c;
    }

}
