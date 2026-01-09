import java.util.*;
public class Swap{
    public static void SwapFunc(int a, int b){
        int temp =a ;
        a=b;
        b= temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        SwapFunc(a, b);
        
    }
}
