package refuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{3, 4, 5, 6, 3, 4, 4, 5, 5, 5}));
    }
    public static int moda(int[] numeros){
        int moda = 0;
        int max = 0;
        Map<Integer, Integer> mapa = new HashMap<>();
        Integer valor;
        for (int i = 0; i < numeros.length; i++) {
            valor = mapa.get(numeros[i]);
            if (valor == null){
                mapa.put(numeros[i], 1);
            }else{
                mapa.put(numeros[i], valor + 1);
            }
            //mapa.put(numeros[i], mapa.getOrDefault(numeros[i], 0) + 1);

        }
        /**
         * Otra forma mejor con un for avanzado
        for (int numero : numeros){
            mapa.put(numero, mapa.getOrDefault(numero, 0) + 1);
        }*/

        /**
         * Y ahora recorremos el map mediante clave y valor, donde clave
         * será el número y clave será cuántas veces se repite
         */
        for(Map.Entry<Integer, Integer> entry: mapa.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}
