package pl.michal.Chapter2;

public class Zadanie47 {

    public static void main(String[] args) {

        String numbers = "";

        for(int i = 0; i <10; i++)
            numbers += (char)(i+48);        // Tablea ASCII

        System.out.println(numbers);
    }
}
