package repasoRefuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{1, 2, 3, 5, 1, 2, 1}));
    }
    public static int moda(int[] numeros){
        Map<Integer, Integer> mapa = new HashMap<>();
        Integer veces;
        int clave;
        int maximo = 0;
        int moda = 0;
        // 1º Calculamos el mapa de frecuencias, guardando como clave el valor del número
        // y como valor las veces que se repite
        for (int i = 0; i < numeros.length; i++) {
            //Si ya está almacenada esa clave, nos dará el número de veces que se repita
            // Si no lo está, nos devolverá null
            veces = mapa.get(numeros[i]);
            if (veces == null){
                mapa.put(numeros[i], 1);
            }else{
                mapa.put(numeros[i], veces + 1);
            }

            //De otra forma sería así
            /*
            mapa.put(numeros[i], mapa.getOrDefault(numeros[i], 1) + 1);
             */
        }
        //Siempre es igual, pero varía <Integer, Integer> que son los tipos de
        //datos del mapa
        for(Map.Entry<Integer, Integer> entry: mapa.entrySet()){
            clave = entry.getKey();
            veces = entry.getValue();
            if (veces > maximo){
                maximo = veces;
                moda = clave;
            }
        }
        return moda;
    }
}
