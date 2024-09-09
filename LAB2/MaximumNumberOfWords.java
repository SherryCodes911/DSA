package LAB2;

public class MaximumNumberOfWords {
    public static void main(String[] args) {
        String [] sentence={"Hello! im Shahriyar","you're a Batman",
                "Im in a movie"};
        int count=0;
        for(int i=0; i<sentence.length; i++){
            sentence[i]=sentence[i].toLowerCase();
            String []array=sentence[i].split(" ");
            if(array.length>count){
                count=array.length;
            }
        }
        System.out.println(count);
    }
}
