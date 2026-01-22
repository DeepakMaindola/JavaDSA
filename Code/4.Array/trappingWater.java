import java.util.*;
public class trappingWater{
    public static void trappedWater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        
        System.out.println("Total trapped water: " + trappedWater);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the height array: ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.print("Enter the elements of the height array: ");
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        trappedWater(height);
    }
}