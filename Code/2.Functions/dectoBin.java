import java.util.*;
public class dectoBin{
    public static int dectoBin(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int lDigit =n%2;
            bin = bin +(lDigit *(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        return bin;
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a Decimal number:");
    int n= sc.nextInt();
    int dec = dectoBin(n);
    System.out.print("Binary number of" +n+ "is:"+ dec);

}
}
