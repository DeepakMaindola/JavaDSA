import java.util.*;
public class maxSubarrSum{
    public static void subArraysum(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
        public static void main(String[] args) {
        int arr[] = {-2,4,6,8,-10};
        subArraysum(arr);
    }
}
