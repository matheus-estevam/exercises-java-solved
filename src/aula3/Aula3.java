package aula3;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do Ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("Qual a idade do Ninja: ");
        int idadeDoNinja = sc.nextInt();
        System.out.println("Qual a altura do Ninja: ");
        double alturaDoNinja = sc.nextDouble();
        System.out.println("O Ninja é membro da akatsuki: ");
        boolean membroDaAkatsuki = sc.nextBoolean();
        char rankMissao = 'D';


        System.out.println("==============FICHA NINJA=================");
        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("A idade do ninja é: " + idadeDoNinja);
        System.out.println("A altura do ninja é: " + alturaDoNinja);
        System.out.println("O ninja e membro da Akatsuki: " + membroDaAkatsuki);
        System.out.println("Rank da missão é : " + rankMissao);




        sc.close();
    }
}
