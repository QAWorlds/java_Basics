package interview;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}


//We initialize max and min with the first element and update as we loop.