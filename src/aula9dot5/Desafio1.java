package aula9dot5;

public class Desafio1 {
    public static void main(String[] args) {
        int[][] pontuacao = {
                {8, 7, 9},
                {6, 8, 7},
                {9, 9, 8}
        };


        System.out.println("Time 7: " +(pontuacao[0][0] + pontuacao[0][1] + pontuacao[0][2])+ " pontos");
        System.out.println("Time 10: " +(pontuacao[1][0] + pontuacao[1][1] + pontuacao[1][2])+ " pontos");
        System.out.println("Time 8: " +(pontuacao[2][0] + pontuacao[2][1] + pontuacao[2][2])+ " pontos");
    }
}
