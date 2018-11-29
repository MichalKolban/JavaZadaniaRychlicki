package pl.michal.Chapter2;

public class Zadanie43 {

    public static void main(String[] args) {

        char[] elements = {'d','z','i','e','n','d','o','b','r','y'};

        for(int i =0; i < elements.length; i++){                        // napis pionowo
            System.out.println(elements[i]);
        }


        for(int i=0; i<elements.length; i++){                           // napis poziomo ze spacjami
            System.out.print(elements[i] + " ");
        }
        System.out.println();

        for (int i=0; i<elements.length; i++){
            elements[i] = Character.toUpperCase(elements[i]);
        }
        System.out.println(elements);

        for(int i=0; i< elements.length; i++){
            elements[i] = Character.toLowerCase(elements[i]);
        }
        System.out.println(elements);
    }
}
