package pl.michal.Chapter2;

public class Zadanie44 {

    public static void main(String[] args) {

        String word = "programowanie";

        word = Character.toUpperCase(word.charAt(0))+word.substring(1);

        System.out.println(word);

        word = word.toUpperCase();

        System.out.println(word);
    }
}
