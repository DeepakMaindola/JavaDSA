import java.util.*;
public class Product{
    public static int ProductFunc(int a , int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        int product= ProductFunc(a,b);
        System.out.print("the product of a and b is :"+ product);
    }
}
