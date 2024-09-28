package LAB1;

//Insertion at the Start of an Array
public class InsertionInArray {
    public static void main(String[] args) {
        int []array=new int[6];
        array[0]=2;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;
        System.out.println("<<<Before Insertion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+i+":"+array[i]);
        }
        int NewElement=0;
        System.out.println("<<<After Insertion>>>");
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=NewElement;
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+i+":"+array[i]);
        }

    }
}
