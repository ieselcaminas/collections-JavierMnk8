package flujos;

import java.util.ArrayList;
import java.util.List;

public class StatisticsStreams {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        
        numeros.add("25");
        numeros.add("15");
        numeros.add("6");

        long cuantos = numeros.stream()
                .mapToInt(s-> Integer.valueOf(s))
                .filter(n -> n % 2 == 0 || n % 3 == 0)
                .count();



        // la media
        double media = numeros.stream()
                //Convertimos a int
                .mapToInt(s -> Integer.valueOf(s))
                //sacamos la media
                .average()
                //devolvemos el valor como double
                .getAsDouble();

        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, media );

        numeros.stream().map(s->Integer.valueOf(s)).
                filter(n -> n % 3 == 0).
                forEach(value -> System.out.println(value));


    }
}
