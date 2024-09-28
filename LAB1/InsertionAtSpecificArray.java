package LAB1;

//Insertion at specific position of an array
public class InsertionAtSpecificArray {
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
        int NewElement=5;
        int position=2;
        System.out.println("<<<After Insertion>>>");
        for(int i=array.length-1;i>position;i--){
            array[i]=array[i-1];
        }
        array[position]=NewElement;
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+i+":"+array[i]);
        }

    }
}
