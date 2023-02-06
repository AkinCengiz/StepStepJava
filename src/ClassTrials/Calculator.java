package ClassTrials;

public class Calculator {
    public static int add (int...numbers)
    {
        int total = 0;
        for(int i : numbers)
        {
            total += i;
        }
        return total;
    }
    public static int difference(int...numbers)
    {
        int result = numbers[0];
        for(int i = 1; i < numbers.length; i++)
        {
            result -= numbers[i];
        }
        return result;
    }
    public static int multiplication(int...numbers)
    {
        int result = 1;
        for(int i : numbers)
        {
            result *= i;
        }
        return result;
    }
    public static double division(int...numbers)
    {
        double dividing = (double) numbers[0];
        for(int i = 1; i < numbers.length;i++)
        {
            if(numbers[i] != 0)
            {
                dividing /= (double) numbers[i];
            }else{
                System.out.println("Bölen 0 olamaz. 0'a bölme hatası oluştu.");
                return -1;
            }
        }
        return dividing;
    }
}
