package LAB5;

import java.util.Arrays;

public class NextGreaterElement_i {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int num : nums2) {
                if (num == nums1[i]) found = true;
                if (found && num > nums1[i]) {
                    result[i] = num;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement_i solution = new NextGreaterElement_i();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println("Next greater elements: " + Arrays.toString(result));
    }
}
