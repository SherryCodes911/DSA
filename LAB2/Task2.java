package LAB2;
public class Task2 {
    public static void main(String[] args) {

        int []nums={2,4,9,6,8,0,1};
        int target=8;
        int x=0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[j]>nums[i]){
                    x=nums[i];
                    nums[i]=nums[j];
                    nums[j]=x;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.print("Index: "+nums[i]);
                break;
            } else{
                System.out.print("Not found");
            }
        }
    }
}
