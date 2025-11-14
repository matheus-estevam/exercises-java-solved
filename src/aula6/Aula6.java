package aula6;

public class Aula6 {
    public static void main(String[] args) {

        boolean passouNoExame = false;
        int tentativas = 0;

        while (!passouNoExame){
            tentativas++;

            if(tentativas == 5){
                passouNoExame = true;
                System.out.println("Naruto passou no exame depois de " + tentativas);
            }
        }

        for (int i = 1; i <= 10 ; i++) {

            int jutsus = 10;
            System.out.println("Kakashi faz " + jutsus + " Jutsus para mostrar para os alunos no dia " + i);
        }

        boolean narutoComFome = true;
        int tigelaDeRamen = 1;

        do {
            System.out.println("Naruto comeu " + tigelaDeRamen + " tiagela de Ramen");

            tigelaDeRamen++;
            if(tigelaDeRamen >= 6){
                narutoComFome = false;
                System.out.println("Naruto está cheio!");
            }

        }while(narutoComFome);


    }
}
