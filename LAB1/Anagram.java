package LAB1;

import java.util.Arrays;

class Anagram{
    public void isAnagram(String s, String t) {
        char [] str1 = s.toCharArray(), str2 = t.toCharArray();
        Arrays.sort(str1); Arrays.sort(str2);
        if(Arrays.equals(str1, str2)){
            System.out.println("Anagram found");
        }else{
            System.out.println("Not Anagram words");
        }
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        String str1="listen";
        String str2="silent";
        a.isAnagram(str1, str2);

    }
}