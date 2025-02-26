package comparable.ninos;

import java.util.ArrayList;
import java.util.List;

public class Bondad {
    public static void main(String[] args) {
        List<Ninyo> ninyos = new ArrayList<>();
        Ninyo n = new Ninyo(80, 20);
        ninyos.add(n);

        n = new Ninyo(100, 12);
        ninyos.add(n);

        n = new Ninyo(100, 1);
        ninyos.add(n);

        ninyos.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
