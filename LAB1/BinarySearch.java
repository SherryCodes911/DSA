package LAB1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []array = {11,22,33,44,55};
        int target = 33;
        Arrays.sort(array);
        int left = 0, right = array.length - 1, middle;
        boolean found = false;

        while (left <= right) {
            middle = left + (right-left) / 2;
            if (array[middle] == target) {
                found = true;
                System.out.println("Element found at index " + middle);
                break;
            }
            if (array[middle] < target) {
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }if (found==false){
            System.out.println("Not found");
        }
    }
}
