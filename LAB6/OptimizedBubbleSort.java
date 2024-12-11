package LAB6;

public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int []arr={6,1,2,3,4,5};
        boolean sorted=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    sorted=true;
                }
            }
            if(!sorted){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
