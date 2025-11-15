package aula10;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome de um personagem: ");
        String nome = sc.nextLine();

        if(nome.startsWith("N")){
            System.out.println("O nome começa com a letra N");
        }else{
            System.out.println("O nome não começa com a letra N");
        }
    }
}
