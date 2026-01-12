import java.util.*;
public class BinaryS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}