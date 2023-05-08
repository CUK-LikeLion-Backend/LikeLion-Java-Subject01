package main.java.bonus00;

import java.util.Scanner;
public class binarySearch {
    public static int binarySearchFuc(int[] array, int target, int left, int right) {
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;

        if(array[mid] == target){
            return mid;
        }
        else if(array[mid] > target) {
            return binarySearchFuc(array, target, left, mid - 1);
        }
        else{
            return binarySearchFuc(array, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {0, 2, 3, 5, 6, 7, 10, 18, 44};

        int target = sc.nextInt();
        System.out.println(binarySearchFuc(array, target, 0, array.length - 1));
    }
}
