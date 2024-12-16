import java.util.Scanner;

public class circumstance {
    public static double getcircumstance(double r){
        return 2 * 3.14 *r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        System.out.println(getcircumstance(r));
    };
    
}
