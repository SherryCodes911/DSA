package LAB1;

//Insertion of an element at the end of the array
public class InsertionAtEndArray {
    public static void main(String[] args) {
        int []array=new int[6];
        array[0]=3;
        array[1]=6;
        array[2]=9;
        array[3]=12;
        array[4]=15;

        System.out.print("<<<Before insetion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
        int newElment=60;
        array[array.length-1]=newElment;
        System.out.println("<<<After insetion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
    }
}
