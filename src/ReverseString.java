import java.util.*;

public class ReverseString {

    //string reverse method
        static void reverse(char[] a, int n) {
            char[] b = new char[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }

            // printing the reversed array
            System.out.print("Your BackwardLand name is ");
            for (int k = 0; k < n; k++) {
                System.out.print(b[k]);
            }
        }

    public static void main(String[] args){
        //taking the input
        Scanner reader = new Scanner(System.in);
        System.out.print("What's your name? ");
        char[] word = reader.nextLine().toCharArray();
        reverse(word, word.length);
    }
}
