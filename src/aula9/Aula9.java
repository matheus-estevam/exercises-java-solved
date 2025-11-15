package aula9;

public class Aula9 {
    public static void main(String[] args) {
        int[][] desempenho = new int[3][3];

        // Time 7: linha 0
        desempenho[0][0] = 8; // missão 1
        desempenho[0][1] = 9; // missão 2
        desempenho[0][2] = 7; // missão 3

        // Time 10: linha 1
        desempenho[1][0] = 6;
        desempenho[1][1] = 8;
        desempenho[1][2] = 8;

        // Time 8: linha 2
        desempenho[2][0] = 9;
        desempenho[2][1] = 7;
        desempenho[2][2] = 8;

        int[][] pontos = {
                {8, 9, 7},   // Time 7
                {6, 8, 8},   // Time 10
                {9, 7, 8}    // Time 8
        };

        System.out.println(pontos[0][0]);
    }
}
