package aula7;

public class Aula7 {
    public static void main(String[] args) {
        String[] hokages = {"Hashirama Senju", "Tobirama Senju", "Hiruzen Sarutobi", "Minato Namikaze","Tsunade Senju","Kakashi Hatake","Naruto Uzumaki"};

        for (int i = 0; i < hokages.length; i++) {
            System.out.println((i +1) +" Hohake é => " + hokages[i]);
        }

        int[] notasNarutos = {0,1,2,1,4};
        double mediaNaruto = (notasNarutos[0] + notasNarutos[1] + notasNarutos[2] + notasNarutos[3] + notasNarutos[4]) / 5.0;

        System.out.println("A media das notas do Naruto é : " + mediaNaruto);

        String[] narutoJutsu = new String[4];
        narutoJutsu[0] = "Kage Bunshin no Jutsu";
        narutoJutsu[1] = "Rasengan";
        narutoJutsu[2] = "Kuchiyose no Jutsu";
        narutoJutsu[3] = "Rasenshuriken";

        for (int i = 0; i < narutoJutsu.length ; i++) {
            System.out.println("Naruto aprendeu o jutsu: " + narutoJutsu[i]);
        }
    }
}
