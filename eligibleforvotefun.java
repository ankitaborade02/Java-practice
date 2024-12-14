import java.util.Scanner;

public class eligibleforvotefun {
    public static boolean iseligibleforvote(int age){
        if(age>=18){
            return true;
        }else{
           return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(iseligibleforvote(age));
    }
    
}
