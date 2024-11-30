
// perform all operation using operator

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        // int sum = a+b;
        // System.out.println(sum);

        // int sub = a - b;
        // System.out.println(sub);

        // int mul = a * b;
        // System.out.println(mul);

        // int div = a / b;                    
       //  System.out.println(div);

       int mod = a % b;                // it will give reminder
       System.out.println(mod);     


    }

    
}
