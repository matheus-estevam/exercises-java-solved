package aula9dot5;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> jutsusNaruto = new ArrayList<>();
        jutsusNaruto.add("Kage Bunshin no Jutsu");
        jutsusNaruto.add("Rasegan");
        jutsusNaruto.add("Kuchiyose no Jutsu");
        jutsusNaruto.add("Rasenshuriken");
        jutsusNaruto.add("Clone");
        jutsusNaruto.remove("Clone");

        System.out.println("Digite o nome de um jutsu: ");
        String nomeDoJutsu = sc.nextLine();

        if(jutsusNaruto.contains(nomeDoJutsu)){
            System.out.println("O Naruto aprendeu esse Jutsu!");
        }else{
            System.out.println("O Naruto não aprendeu esse Jutsu!");
        }
    }
}
