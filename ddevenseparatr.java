import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenSeparator {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> oddElements = new ArrayList<>();
        List<Integer> evenElements = new ArrayList<>();

        separateOddEven(inputArray, oddElements, evenElements, 0);

        System.out.println("Odd elements: " + oddElements);
        System.out.println("Even elements: " + evenElements);
    }

    public static void separateOddEven(int[] arr, List<Integer> odd, List<Integer> even, int index) {
        // Base case: check if the index is out of bounds
        if (index == arr.length) {
            return;
        }

        // Recursive case: check if the current element is odd or even
        int currentElement = arr[index];
        if (currentElement % 2 == 0) {
            even.add(currentElement);
        } else {
            odd.add(currentElement);
        }

        // Move to the next index
        separateOddEven(arr, odd, even, index + 1);
    }
}
