

// take tree input and print small, greater and equal

import java.util.Scanner;

public class nestedcondition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println(" a is Greater");
        } else {
            System.out.println(" a is Smaller");

        }
    }

}