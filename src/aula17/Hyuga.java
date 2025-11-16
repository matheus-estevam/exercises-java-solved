package aula17;

public class Hyuga {
    private boolean byaguganAtivo = false;

    public boolean ativarByakugan(){
        byaguganAtivo = true;
        return byaguganAtivo;
    }

    public boolean isByakuganAtivo(){
        if (byaguganAtivo == true) {
            return true;
        }else {
            return false;
        }
    }
}
