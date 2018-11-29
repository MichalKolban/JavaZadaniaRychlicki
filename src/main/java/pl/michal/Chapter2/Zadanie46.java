package pl.michal.Chapter2;

public class Zadanie46 {

    public static void main(String[] args) {

        String word = "programowanie";

        char[] elements = word.toCharArray();

        for(int i=0, j=elements.length-1; i<j; i++, j--){       // odwracamy kolejnosć znaków
            char temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }

        word = new String(elements);

        System.out.println(word);




    }
}
