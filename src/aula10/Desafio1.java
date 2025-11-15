package aula10;

public class Desafio1 {
    public static void main(String[] args) {
        String frase = "A vontade do fogo vive em Konoha";
        String fraseNova = frase.replace("fogo","raio");
        String fraseMaiuscula = frase.toUpperCase();

        System.out.println(frase);
        System.out.println(fraseNova);
        System.out.println(fraseMaiuscula);
    }
}
