package LAB6;

public class StringsByLength{
    public static void main(String[] args) {
        String []arr={"apple", "pie", "banana", "cat"};
        boolean sorted=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].length()>arr[j].length()){
                    String temp=arr[i];
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
