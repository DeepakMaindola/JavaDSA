import java.util.*;
public class count {
    public static void countSort(int arr[]){
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int count[] = new int[max+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<=max; i++){
            count[i] += count[i-1];
        }
        int output[] = new int[n];
        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
