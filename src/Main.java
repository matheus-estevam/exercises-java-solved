import aula16.Nara;
import aula17.Hyuga;
import aula18.Jutsu;
import aula18.JutsuAgua;
import aula18.JutsuFogo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jutsu jutsu = new Jutsu();
        JutsuAgua agua = new JutsuAgua();
        JutsuFogo fogo = new JutsuFogo();

        agua.executar();
        fogo.executar();
        jutsu.executar();

        
    }
}