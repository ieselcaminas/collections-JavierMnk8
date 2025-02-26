package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Juan", "Amor", 1968);
        personas.add(p);

        p = new Person("María", "García", 1985);
        personas.add(p);

        long cuantas = personas.stream()
                //En este caso filtramos por las que empiezan por A
                .filter(persona -> persona.getLastName().startsWith("A"))
                //las contamos
                .count();

        System.out.println(cuantas);
    }
}
