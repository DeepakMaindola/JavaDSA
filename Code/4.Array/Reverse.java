import java.util.*;
public class Reverse{
    public static void reverseArray(int[] arr){
        int l=0, r= arr.length -1;
        while (l<r){
            int temp= arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("enter the " + i+"th element: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("original array: " +Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("reversed array: " +Arrays.toString(arr));
        sc.close();
    }
}