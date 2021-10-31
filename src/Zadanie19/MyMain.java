package Zadanie19;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        Author people1 = new Author("Jan Kochanowski", "Poland");
        Author people2 = new Author("Dante Alligierii", "Itally");
        Author people3 = new Author("Fieodor Dostojewski", "Poland");
        Author[] peoples = {people1, people2, people3};

        Random generatorek = new Random();
        int losowaLiczba;

        Poem[] positionPoem = new Poem[peoples.length];
        for (int i = 0; i < peoples.length; i++) {
            losowaLiczba = generatorek.nextInt(1000);
            positionPoem[i] = new Poem(peoples[i], losowaLiczba);
        }

        int stropheTmp = positionPoem[0].getStropheNumber();
        for (int i = 0; i < peoples.length; i++) {
            System.out.println("Pisarz: " + peoples[i].getSurname() + " napisał: " + positionPoem[i].getStropheNumber() + " strof");
            if (positionPoem[i].getStropheNumber() > stropheTmp) {
                stropheTmp = positionPoem[i].getStropheNumber();
            }
        }

        for (int i = 0; i < positionPoem.length; i++) {
            if (positionPoem[i].getStropheNumber() == stropheTmp) {
                System.out.println("\nNajwydajniejszym pisarzem okazał się: " + peoples[i].getSurname());
            }
        }
    }
}
