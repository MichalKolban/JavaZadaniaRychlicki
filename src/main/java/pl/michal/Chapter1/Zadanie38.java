package pl.michal.Chapter1;

public class Zadanie38 {

    public static void main(String[] args) {

        char[] elements = new char[16];                 // cyfry układu szestnastkowego

        for(int i = 0; i <16; ++i)
            elements[i] = Character.forDigit(i,16);


        System.out.println(elements);
    }
}
