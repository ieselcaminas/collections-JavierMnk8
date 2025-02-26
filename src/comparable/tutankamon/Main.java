package comparable.tutankamon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tesoro> tesoros = new ArrayList<>();

        Tesoro t = new Tesoro(1, "Flecha", 5, 1);
        tesoros.add(t);

        t = new Tesoro(2, "Sandalias", 10, 2);
        tesoros.add(t);

        t = new Tesoro(3, "Sarcófago", 1000, 1000);
        tesoros.add(t);

        t = new Tesoro(4, "Máscara", 1000, 10);
        tesoros.add(t);

        t = new Tesoro(5, "Arco", 10, 2);
        tesoros.add(t);

        tesoros.stream().sorted().forEach(System.out::println);
    }
}
