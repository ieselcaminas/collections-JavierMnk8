package comparable.analfabeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Analfabetos {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/illiterate.csv"));
        List<Pais> paises = new ArrayList<>();
        Pais pais;
        String linea;
        String[] datos;

        reader.readLine();
        while ((linea = reader.readLine())!=null) {
            datos = linea.split(",");
            pais = new Pais(datos[5], Integer.parseInt(datos[8]));
            paises.add(pais);
        }
        paises.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
