package aula18;

public class Jutsu {
    private String nomeJutsu;

    public Jutsu() {


    }

    public Jutsu(String nomeJutsu) {
        this.nomeJutsu = nomeJutsu;
    }


    public String getNomeJutsu() {
        return nomeJutsu;
    }

    public void setNomeJutsu(String nomeJutsu) {
        this.nomeJutsu = nomeJutsu;
    }

    public void executar(){
        System.out.println("Jutsu foi executado");
    }
}
