import java.util.*;
public class pairsArray{
    public static void PrintPairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                System.out.print("("+ arr[i]+ "," + arr[j]+") ");
            }
            System.out.println();
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
        PrintPairs(arr);
        sc.close();
    }

}
