import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print ("Input a number to sum to: ");

        int num = reader.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}


