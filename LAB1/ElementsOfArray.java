package LAB1;

//Printing the values stored in an array
public class ElementsOfArray {
    public static void main(String[] args) {
        int []array={5, 15, 25, 35, 45, 55};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("............With Index...........");
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+ i +": "+ array[i]);
        }

    }
}
