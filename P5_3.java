/* Write a java program to implement an interface called Exam with a 
method Pass (int mark) that returns a boolean. Write another interface called 
Classify with a method Division (int average) which returns a String. 
Write a class called Result which implements both Exam and Classify. 
The Pass method should return true if the mark is greater than or equal to
50 else false. The Division method must return "First" when the parameter average
is 60 or more, "Second" when average is 50 or more but below 60, 
"No division" when average is less than 50. */

/*
total 150
gtu --> 70 || %33 = 23
mid --> 30 || %33? = 12
viva --> 30 || %33? = 15
project/assignment --> 20 || %33? = 10

interface Exam {
    boolean Pass(int[] mark);
}

//In result class
  public boolean Pass(int[] mark) {
// 0 -> GTU, 1 -> Mid, 2 -> Viva, 3 -> Project/Assignment
        if (mark[0] < 0 || mark[0] > 70 || mark[1] < 0 || mark[1] > 30 || mark[2] < 0 || mark[2] > 30 || mark[3] < 0 || mark[3] > 20) {
            System.out.println("Invalid marks\n");
            return false;
        }

        if (mark[0] >= 23 && mark[1] >= 12 && mark[2] >= 15 && mark[3] >= 10) {
            return true;
        }
        return false;
    }
 */
import java.util.*;

interface Exam {
    boolean Pass(int mark);
}

interface Classify {
    String Division(int average);
}

class Result implements Exam, Classify {
    public boolean Pass(int mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark");
            System.exit(1);
        }

        return mark >= 50;
    }

    public String Division(int average) {
        if (average >= 60) return "First";
        else if (average >= 50) return "Second";
        else return "No division";
    }
}

public class P5_3 {
    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");
        Scanner se = new Scanner(System.in);

        System.out.print("How many subject is in this semester: ");
        int sum = 0, sub = se.nextInt();

        Result r = new Result();
        for (int i = 0; i < sub; i++) {
            System.out.print("\nEnter " + (i + 1) + " subject's mark: ");
            int mark = se.nextInt();
            sum += mark;
            String pass = r.Pass(mark) ? "Pass" : "Fail";
            System.out.println(pass + " in " + (i + 1) + " subject");
        }
        String div = r.Division(sum/sub);
        System.out.println("\nDivision: " + div);
        se.close();
    }
}