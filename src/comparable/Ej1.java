package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej1 {

    public static void main(String[] args) {
        int[] numeros = new int[]{2, 5, 1, 4};

        Arrays.sort(numeros);
        //Arrays.stream(numeros).forEach(System.out::println);

        List<Person> personas = new ArrayList<>();

        Person p = new Person("Juan", "García", 1999);
        personas.add(p);
        p = new Person("María", "Ortiz", 2001);
        personas.add(p);
        //Ahora quiero ordenar
        personas.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
