package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Wykorzystaj pętlę for aby pokazać wszystkie elementy tablicy
        od jej początku w konsoli.
        Użyj kolejnej pętli for aby pokazać elementy tablicy
        od końca do początku.
         */
        String[] names = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};
        for (int i=0; i<names.length; i++) {
            System.out.println("Imię: " + names[i]);
        }
        System.out.println("I teraz od tyłu");
        for (int n = names.length-1; n>=0; n--) {
            System.out.println("Imię: " + names[n]);
        }
    }
}