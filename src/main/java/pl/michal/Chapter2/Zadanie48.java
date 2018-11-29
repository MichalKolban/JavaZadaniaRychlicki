package pl.michal.Chapter2;

public class Zadanie48 {

    public static void main(String[] args) {

        String numbers = "";

        for(int i=0;i <16; i++)
            numbers += Character.forDigit(i,16);

        System.out.println(numbers);
    }
}
