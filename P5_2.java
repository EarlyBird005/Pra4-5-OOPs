/* Write a program that demonstrates the instance of operator. Declare interfaces I1 and I2. 
Interface I3 extends both of these interfaces. Also declare interface I4. Class X implements 
I3. Class W extends X and implements I4. Create an object of class W. Use the instance of 
operator to test if that object implements each of the interfaces and is of type X.  */
import java.util.*;

interface I1 {}
interface I2 {}
interface I3 extends I1, I2 {}
interface I4 {}
class X implements I3 {}
class W extends X implements I4 {}

public class P5_2 {
    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");

        W wobj = new W();
        if (wobj instanceof W) 
            System.out.println("wobj is instance of W");
        if (wobj instanceof X) 
            System.out.println("wobj is instance of X");
        if (wobj instanceof I1 && wobj instanceof I2 && wobj instanceof I3 && wobj instanceof I4) 
            System.out.println("\nwobj implements interface I1, I2, I3 & I4");
    }
}

// import java.util.*;

// interface I1 {
//     void methodI1();
// }

// interface I2 {
//     void methodI2();
// }

// interface I3 extends I1, I2 {
//     void methodI3();
// }

// interface I4 {
//     public void methodI4();
// }

// class X implements I3 {
//     private int x;

//     X(int x) {
//         this.x = x;
//     }

//     int getX() {
//         return x;
//     }

//     void methodX() {
//         System.out.println("Method X");
//     }

//     public void methodI1() {
//         System.out.println("Method I1");
//     }

//     public void methodI2() {
//         System.out.println("Method I2");
//     }

//     public void methodI3() {
//         System.out.println("Method I3");
//     }
// }

// class W extends X implements I4 {
//     private int w;

//     W(int w) {
//         super(w);
//         this.w = w;
//     }

//     int getW() {
//         return w;
//     }

//     void methodW() {
//         System.out.println("Method W");
//     }

//     public void methodI4() {
//         System.out.println("Method I4");
//     }
// }

// public class P5_2 {
//     public static void main(String[] args) {
//         System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
//         Date t = new Date();
//         System.out.println(t + "\n");
        
//         W wobj = new W(8);
//         wobj.methodI1();
//         wobj.methodI2();
//         wobj.methodI3();
//         wobj.methodI4();
//         wobj.methodW();
//         wobj.methodX();
//         System.out.println("\nx: " + wobj.getX());
//         System.out.println("W: " + wobj.getW());
//     }
// }
