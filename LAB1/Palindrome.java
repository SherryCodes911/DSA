package LAB1;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.next();
        for (int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome yayyyyy!");
    }
}
