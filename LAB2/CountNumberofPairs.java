package LAB2;

public class CountNumberofPairs {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8,9,10};
        int targetOutput=2;
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (Math.abs(nums[j]-nums[i]) == targetOutput){
                    count++;
                }
            }
        } System.out.println("Number of pairs found in array: "+count);
    }
}
