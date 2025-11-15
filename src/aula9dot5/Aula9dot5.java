package aula9dot5;

import java.util.ArrayList;

public class Aula9dot5 {
    public static void main(String[] args) {
        String[] personagens = {"Sasuke","Naruto","Sakura","Obito","Gai","Madara"};

        for (int i = 0; i < personagens.length ; i++) {
            System.out.println("Os 5 personagens de Naruto são: " + personagens[i]);
        }

        ArrayList<String> jutsusNaruto = new ArrayList<>();
        jutsusNaruto.add("Kage Bunshin no Jutsu");
        jutsusNaruto.add("Rasegan");
        jutsusNaruto.add("Kuchiyose no Jutsu");
        jutsusNaruto.add("Rasenshuriken");
        jutsusNaruto.add("Clone");
        jutsusNaruto.remove("Clone");

        for (int i = 0; i <jutsusNaruto.size() ; i++) {
            System.out.println("Lista de jutsus do Naruto: " + jutsusNaruto.get(i));
        }

        int[][] pontuacao = {
                {8, 7, 9},
                {6, 8, 7},
                {9, 9, 8}
        };

        for (int time = 0; time < 3; time++) {
            for (int missao = 0; missao < 3; missao++) {
                System.out.println("Time " + time + " na missão " + missao + ": " + pontuacao[time][missao]);
            }
        }

    }
}
