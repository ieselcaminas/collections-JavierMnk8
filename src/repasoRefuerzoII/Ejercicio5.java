package repasoRefuerzoII;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(mediana(new int[]{1, 2, 3, 4, 5, 5, 6, 7}));
    }
    public static double mediana(int[] numeros){
        double mediana;
        double valor1;
        double valor2;

        //Podemos ordenarlo aunque el enunciado dice que ya lo está
        Arrays.sort(numeros);

        // Para la mediana pasan dos cosas
        //- Que el número de datos sea impar por lo que la mediana es el valor que
        // está en el medio
        //- Que sea par en cuyo caso es la media de los dos números centrales
        if (numeros.length % 2 == 0){
            valor1 = numeros[numeros.length/2]; //Número central derecho
            valor2 = numeros[numeros.length/2 - 1]; //Número central izquierdo
            mediana = (valor1 + valor2) / 2;
        }else{
            mediana = numeros[numeros.length / 2]; // número central
        }
        return mediana;
    }
}
