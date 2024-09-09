package LAB2;

public class CommonElementArray {
    public static void main(String[] args) {
        int []nums1={2,3,2};
        int []nums2={2,1};
        boolean[] foundInNums2 = new boolean[nums1.length];
        boolean[] foundInNums1 = new boolean[nums2.length];

        int count1=0, count2=0;
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i] ==nums2[j]) {
                    if (!foundInNums2[i]) {
                        count1++;
                        foundInNums2[i] = true;
                    }
                    break;
                }
            }
        }
        for (int i=0; i<nums2.length; i++) {
            for (int j=0; j<nums1.length; j++) {
                if (nums2[i]==nums1[j]) {
                    if (!foundInNums1[i]) {
                        count2++;
                        foundInNums1[i] = true;
                    }break;
                }
            }
        }System.out.println("num1 elements common in num2: "+ count1);
        System.out.println("num2 elements common in num1: "+ count2);
    }
}
