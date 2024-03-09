/* A set of 5 words (strings) will be taken as command line arguments. Write a program to reverse each word and check whether it is palindrome or not using method. */
// java Pra4_1.java
import java.util.*;

public class Pra4_1 {
    public static boolean checkPalindrome(String str) {
        String revString = "";

        for (int i = str.length() - 1; i > -1; i--) {
            revString += str.charAt(i);
        }

        if (revString.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");

        if (args.length != 5) {
            System.out.println("Enter 5 words as a command line arguments.");
            System.exit(1);
        }

        for (String str: args) {
            if (checkPalindrome(str)) {
                System.out.println(str + " is palindrome");
            } else {
                System.out.println(str + " is not a palindrome");
            }
        }
    }
}