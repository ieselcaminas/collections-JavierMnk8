package comparable;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Human h = new Human("Pepe", 2000);
        humanList.add(h);
        h = new Human("María", 2100);
        humanList.add(h);

        h = new Human("Pepe", 2100);
        humanList.add(h);


        /*humanList.stream()
                .sorted((h1, h2) -> { return h2.getName().compareTo(h1.getName());})
                .forEach(System.out::println);*/

        humanList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
