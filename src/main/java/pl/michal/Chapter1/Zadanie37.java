package pl.michal.Chapter1;

public class Zadanie37 {
    public static void main(String[] args) {

        char[] elements = new char[10];

        for(int i=0;i<10; ++i)
            elements[i] = (char)(i+48);        // tabela znaków +48 w tabeli ASCII to znak 0, potem 1,2,3
        System.out.println(elements);
    }
}


