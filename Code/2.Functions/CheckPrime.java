import java.util.*;
public class CheckPrime {
    public static boolean isPrime(int n){
        boolean isPrime= true;
        if(n<=1){
            return false;
        }else if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check is prime or not:");
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("The number " +n +" is prime");
        else
            System.out.println("The number " +n +" is not prime");
    }
}
