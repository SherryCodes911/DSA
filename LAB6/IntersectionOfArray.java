package LAB6;

import java.util.Scanner;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int []nums1={5,3,2,6,0,6};
        int []nums2={1,3,8,2,9,6};

        for(int j=0;j<nums1.length ;j++){
            nums1[ j+ nums1.length ]=nums2[j]; //m+n
        }
        for(int j=0;j<nums1.length;j++){
            System.out.print(nums1[j]);
        }

        /*
        int []arr=new int arr{};
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length();j++){
                if(nums1[i]==nums1[j]){
                    int temp=nums1==nums2[j];

                    for(int i=0;i<1000;i++){
                        arr[i]=temp;
                    }
                }
            }
        }*/
    }
}
