package pl.michal.Chapter1;

public class Zadanie35 {
    public static void main(String[] args) {

        char[] word = {'p','r','o','g','r','a','m','o','w','a','n','i','e'};

        for(int i=0, j=word.length-1; i <j; ++i, --j){
            char temp = word[i];            // zmienna pomocnicza do zmiany wartosci zmiennych dwoch elemento tsblicy
            word[i] = word[j];
            word[j] = temp;
        }
        System.out.print(word);

    }
}

