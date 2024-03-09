// check palindrome 

// Raw file
import java.util.*;

public class Pra4_1_e {
    static char[] checkPalindrome(char[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            int j = str.length - 1 - i;
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Date t = new Date();
        System.out.println(t);
        char[] str = args[0].toCharArray();

        if (checkPalindrome(str) == str) {
            System.out.println(str);
            System.out.println(" is palindrome");
        } else {
            System.out.print(str);
            System.out.println(" is not a palindrome");
        }
        se.close();
    }
}
