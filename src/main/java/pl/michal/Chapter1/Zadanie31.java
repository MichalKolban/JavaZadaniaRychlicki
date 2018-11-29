package pl.michal.Chapter1;

public class Zadanie31 {

    public static void main(String[] args) {

        char hello[] = {'d','z','i','e','n','d','o','b','r','y'};


        for(char chars : hello){
            System.out.println(chars);
        }

        System.out.println("==========");

        for(char chars : hello){
            System.out.print(chars);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("==========");

        for(int i = 0; i < hello.length ; i++)
            hello[i] = Character.toUpperCase(hello[i]);
        System.out.print(hello);



    }
}
