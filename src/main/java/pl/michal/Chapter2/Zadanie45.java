package pl.michal.Chapter2;

public class Zadanie45 {
    public static void main(String[] args) {

        String word = "programowanie";

        for(int i = word.length()-1; i>=0; i--)
            System.out.print(word.charAt(i));
    }
}
