import java.util.*;
public class kadane{
    public static void kadaneAlgo(int arr[]){
        int n = arr.length;
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum <0){
                currSum =0;
            }else{
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println("the maxSubarray sum using kadane algorithm is:"+ maxSum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array:");
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        kadaneAlgo(arr);
    }
}