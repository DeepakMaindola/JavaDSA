import java.util.*;
public class bintoDec {
public static int bintoDec(int n){
    int pow=0;
    int dec=0;
    while(n>0){
        int lDigit= n%10;
        dec= dec +(lDigit * (int)Math.pow(2,pow));
        pow++;
        n=n/10;
    }
    return dec;
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a Binary number:");
    int n= sc.nextInt();
    int dec = bintoDec(n);
    System.out.print("Decimal number of" +n+ "is:"+ dec);

}
}