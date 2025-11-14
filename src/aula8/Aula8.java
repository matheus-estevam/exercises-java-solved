package aula8;

import java.util.ArrayList;

public class Aula8 {
    public static void main(String[] args) {


        ArrayList<String> timesDeNaruto = new ArrayList<>();
        timesDeNaruto.add("Time 7");
        timesDeNaruto.add("Time 8");
        timesDeNaruto.add("Time 10");
        timesDeNaruto.add("Time 9");
        timesDeNaruto.add("Time Gaara");
        timesDeNaruto.remove("Time 10");

        for (int i = 0; i < timesDeNaruto.size(); i++) {
            System.out.println("Os times restantes são: " + timesDeNaruto.get(i));
        }

    }
}
