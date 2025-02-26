import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {
        String boleto = "95052";
        Character ultimo = boleto.charAt(4);
        Integer numero = Integer.parseInt("" + ultimo);

        /*String[] array = {"uno", "dos", "tres"};
        // Convertir el array a una lista
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
*/
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;

        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(6);
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println(suma / numeros.size());
        //Ordenar un arraylist
        Collections.sort(numeros);

    }
}
