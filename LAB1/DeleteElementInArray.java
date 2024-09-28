package LAB1;

//Delete element from arrsy
public class DeleteElementInArray {
    public static void main(String[] args) {
        int []array={8,16,24,32,40};
        int ElementPosition=2;
        for(int i=ElementPosition;i<array.length-1;i++){
            array[i]=array[i+1];
        }  
        array[array.length-1]=0;
        System.out.println("<<<After Deleting Element>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
    }
}
