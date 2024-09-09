package LAB2;

public class ConcatenationOfArray {
    public static void main(String[] Args) {

        int[] nums= {1,2,3};
        int []ans = new int [2*nums.length];
        for(int i=0;i< nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length]= nums[i];
        }
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i] + ", ");
        }
    }
}
