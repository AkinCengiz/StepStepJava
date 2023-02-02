package review;

public class CanonicalSerial {
    public static void main(String[] args) {
        boolean isIncreasing = true;
        int total = 0;
        int increment = 0;

        for(int i = 1; i <= 35; i += increment)
        {
            System.out.print(i);
            total += i;
            if(i != 35)
            {
                System.out.print(" + ");
            }else
            {
                System.out.print(" = " + total);
            }

            if(increment <= 4 && isIncreasing == true)
            {
                increment++;
                if(increment == 5)
                {
                    isIncreasing = false;
                    continue;
                }
            }else
            {
                increment--;
                if(increment == 1)
                {
                    isIncreasing = true;
                    continue;
                }
            }
        }
    }
}
