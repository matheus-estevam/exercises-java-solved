package aula4;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual nome do Ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("Qual o nivel de Chakra do ninja: ");
        int nivelChakra = sc.nextInt();
        System.out.println("O ninja passou no teste Chunin: ");
        boolean exameChunin = sc.nextBoolean();

        System.out.println(nomeDoNinja + " tem " + nivelChakra + " de chakra e passou no exame: "+ exameChunin);



    }
}
