package comparable.felipe;

import java.util.ArrayList;
import java.util.List;

public class Felipe {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea t = new Tarea(1, 50);
        tareas.add(t);

        t = new Tarea(1, 10);
        tareas.add(t);

        t = new Tarea(4, 10);
        tareas.add(t);

        t = new Tarea(2, 5);
        tareas.add(t);

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
