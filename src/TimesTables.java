import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        System.out.println("What number would you like to check?");
        Scanner myObj = new Scanner(System.in);
        int numberToTable = myObj.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + numberToTable + " = " + (i * numberToTable));
        }
    }
}

//add validation for 12
