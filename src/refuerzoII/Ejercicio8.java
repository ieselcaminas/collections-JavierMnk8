package refuerzoII;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(cualFalta(new int[]{3, 6, 2, 4}));
        System.out.println(cualFalta(new int[]{3, 6, 2, 4, 5}));
    }

    public static int cualFalta(int[] numeros){
        //Ordeno el array
        Arrays.sort(numeros);
        //Voy a comparar un número del array con el siguiente.
        //Siempre que se comprueba un array con el siguiente
        //hemos de poner como límite superior del bucle numeros.length - 1
        //ya que después del último no hay ninguno
        for (int i = 0; i < numeros.length - 1; i++) {
            //Restamos el siguiente con el actual. Si son contiguos devolverá 1
            //Si no lo son es que el que falta es el de enmedio
            if (numeros[i+1] - numeros[i] > 1){
                return numeros[i] + 1;
            }
        }
        return -1;
    }
}
