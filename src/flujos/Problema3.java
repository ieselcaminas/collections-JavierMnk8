package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Juan", "Amor", 1968);
        personas.add(p);

        p = new Person("María", "García", 1985);
        personas.add(p);

        p = new Person("Juan", "García", 1985);
        personas.add(p);



        personas.stream()
                //Mapeamos el apellido porque es sobre el que quiero contar los distintos
                //.map(persona -> persona.getLastName())
                //también se puede hacer como
                .map(Person::getLastName)
                //A partir de ahora, se trabaja con el atributo firstName
                //Sacamos los distintos apellidos
                .distinct()
                //Los ordenamos
                .sorted()
                //Los imprimimos
                .forEach(apellido -> System.out.println(apellido));
                //También se puede hacer como
                //.forEach(System.out::println)
    }
}
