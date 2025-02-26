package flujos.library;


import flujos.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class EjemploBook {
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        Person p = new Person("Miguel", "Cervantes", 1557);
        Book book = new Book(p,"Quijote", 1547);

        System.out.println(book.getName());

        books.add(book);

        p = new Person("Paloma", "Sánchez-Garnica",  2000);
        book = new Book(p, "Victoria", 200);
        books.add(book);

        //1º se aplica un filtro si hace falta
        //2º se mapea a un integer o a otro valor si hace falta
        //3º se hace alguna operación como count(), average, ...
        Double average = books.stream()
                //Queremos trabajar con el año de nacimiento del Autor
                .mapToInt(b -> b.getAuthor().getBirthYear())
                //Que solo pasen los que hayan nacido antes de 1750
                .filter(a -> a < 1750)
                //Sacar la media
                .average()
                //No te olvides de este método
                .getAsDouble();

        System.out.println(average);
    }
}
