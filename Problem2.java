public class Problem2
{
    public static void main(String[] Args)
    {
        int num1 = 6;
        int num2 = 7;
        int num3 = 8;
        System.out.println("First digit: " + (num1 %= 10) );
        System.out.println("Second digit: " + (num2 %= 100) );
        System.out.println("Third digit: " + (num3 %= 1000) );
    }
}

