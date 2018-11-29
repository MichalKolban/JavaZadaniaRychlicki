package pl.michal.Chapter3;

public class Zadanie52 {
    public static void main(String[] args) {

        String name = "Michał";

        String lastName = "Kołban";

        System.out.println("Nazwisko : " + lastName);
        System.out.println("Imię : " + name);
        System.out.println("Nazwisko i imię : " + lastName.toUpperCase() + " " + name);
        System.out.println("Inicjały : " + name.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase());
        System.out.println("Login : " + lastName.substring(0,2).toUpperCase() + name.substring(0,3).toLowerCase());
    }
}
