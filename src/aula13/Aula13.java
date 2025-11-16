package aula13;

import java.util.Scanner;

public class Aula13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um rank: ");
        String rank = sc.nextLine();

        switch (rank){
            case "D":
                System.out.println("Missão Rank D: Ideal para Genin iniciantes.");
                break;
            case "C":
                System.out.println("Missão Rank C: Exige um pouco mais de experiência.");
                break;
            case "B":
                System.out.println("Missão Rank B: Missão para ninjas experientes.");
                break;
            case "A":
                System.out.println("Missão Rank A: Só para Chuunin e Jounin!");
                break;
            case "S":
                System.out.println("Missão Rank S: Somente para os melhores da vila!");
                break;
            default:
                System.out.println("Rank de missão inválido.");
        }
    }


}
