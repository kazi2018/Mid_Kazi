package string.problems;
import java.util.Arrays;
import java.util.Scanner;



public class Anagram {

    public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] wordArr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : wordArr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }

public static boolean isAnagramCharArrySort(String word, String anagram){
    boolean isAnagram = false;
    if (word != null && anagram != null && word.length() == anagram.length()){
        char[]wordCharArray = word.toCharArray();
        char [] anagramCharArray = anagram.toCharArray();
        Arrays.sort(wordCharArray);
        Arrays.sort(anagramCharArray);
        isAnagram = Arrays.equals(wordCharArray, anagramCharArray) ;

    }
    return isAnagram;
}
public static void main (String[]args){
        String result= "";
        System.out.println("**** Program To Check Strings Are Anagram ****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String word = sc.nextLine();
        System.out.print("Enter String To Check Anagram");
        String anagram = sc.nextLine();
        System.out.println("** Using Compare Character by Character");
        boolean isAnagram = Anagram.isAnagram(word,anagram);
        result = (isAnagram)? "Anagram" : "Not Anagram";
        System.out.println("Stirng \"" + word + "\" & \"" + anagram + "\" Are " + result );

        System.out.println("** Using Character Array Sort & Equality Check **");
        isAnagram = Anagram.isAnagramCharArrySort(word,anagram);
        result = (isAnagram) ? "Anagram" : "Not Anagram";
        System.out.println("String \"" + word + "\" & \"" + anagram + "\" Are " + result);
    }
}

