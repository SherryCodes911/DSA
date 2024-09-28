package LAB1;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        int target = 8;
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                found = true;
                System.out.println("element "+target+" found at index: "+i);
                break;
            }
        } if(found ==false){
            System.out.println("element not found!!!!");
        }
    }
}
