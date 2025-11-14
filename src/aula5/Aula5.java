package aula5;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual nome do ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("O ninja tem kurama ?: ");
        boolean temKurama = sc.nextBoolean();
        System.out.println("O ninja tem sharigan ?: ");
        boolean temSharigan = sc.nextBoolean();
        System.out.println("Qual o nivel de chakra do ninja: ");
        int chakra = sc.nextInt();

        if (nomeDoNinja.equals("Naruto") && temKurama && chakra > 70){
            System.out.println("Pode usar Modo Kurama!");
        } else if (nomeDoNinja.equals("Sasuke") && temSharigan) {
            System.out.println("Usa Chidori");
        } else if (nomeDoNinja.equals("Sakura") && chakra > 60) {
            System.out.println("Usa super força");
        }else{
            System.out.println("Treinando com o Kakashi");
        }
    }
}
