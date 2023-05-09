package bonus00;

import java.util.Arrays;
import java.util.Scanner;

public class bonus01 {
    public static int binarySearch(int[] array, int target, int left, int right) {
        int mid = (left + right) / 2 ;
        if(array[mid] ==  target) return mid ;
        if(left > right) return -1;
        if(array[mid] < target) return binarySearch(array, target, mid+1, right);
        return binarySearch(array, target, left, mid-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int res = binarySearch(arr,target,0,arr.length-1);
        System.out.println(res);
    }
}
