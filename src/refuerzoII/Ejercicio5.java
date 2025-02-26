package refuerzoII;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 4, 3, 1, 6, 8};

        System.out.println(mediana(numeros));
    }
    public static double mediana(int[] numeros){
        double mediana;
        Arrays.sort(numeros);
        //Si hay un número par de números, cogemos los dos centrales
        if (numeros.length % 2 == 0){
            //Y sacamos la media (que coincidirá con la mediana) de esos dos números
            double a = (double)numeros[numeros.length / 2];
            double b = (double)numeros[numeros.length / 2 - 1];
            mediana = (a + b)/ 2;
        }else{
            // Cogemos el central
            mediana = numeros[numeros.length / 2];
        }

        return mediana;
    }
}