package LAB2;
import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    public void findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<words.length; ++i){
            String word=words[i];

            for(int j=0; j<word.length(); ++j){
                if(word.charAt(j) == x){
                    System.out.println( ans.add(i));
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        WordsContainingCharacter wc = new WordsContainingCharacter();
        String[] words= {"Sherry","Codes"};
        char a= 'e';
        wc.findWordsContaining(words, a);
    }
}
