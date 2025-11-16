package aula12;

public class ContadorDeMissao{
    static int totalMissoes = 0;
    String nome;

    public ContadorDeMissao(String nome){
        this.nome = nome;
        totalMissoes++;
    }
}
