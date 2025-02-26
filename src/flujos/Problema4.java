package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(-2);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);

        numeros.stream()
                //Filtramos los que son  mayor o igual a 1 y menor o igual a 5
                .filter(n -> n >=1 && n <=5)
                .forEach(System.out::println);
                //O así
                //.forEach(n -> System.out.println(n));
    }
}

