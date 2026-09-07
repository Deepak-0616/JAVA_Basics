import java.util.*;
class binarysearch {

   public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        
        for (int i = 0; left <= right; i++) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();

        int result = binarySearch(arr, t);

        System.out.println("position: "+(result+1));
        sc.close();
    }
}