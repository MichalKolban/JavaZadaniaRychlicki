package pl.michal.Chapter1;

public class Zadanie33 {

    public static void main(String[] args) {

        char[] word = {'p','r','o','g','r','a','m','o','w','a','n','i','e'};

        for(int i  = 0; i<word.length; i++){
            word[0] = Character.toUpperCase(word[0]);
        }
        System.out.println(word);

        System.out.println("=========");

        for(int i=0;i<word.length; i++){
            word[i] = Character.toUpperCase(word[i]);
        }
        System.out.println(word);

        System.out.println("=========");




    }
}