package interview;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        }
    }
}


//Check each number with % 2 to decide if it's even or odd.