package comparable;

import java.util.HashMap;
import java.util.Map;

public class Sorteo {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"03943", "93494", "88384", "95955"}));
    }
    public static Map<Integer, Integer> terminaciones(String[] boletos){
        Map<Integer, Integer> terminaciones = new HashMap<>();
        int ultimo;
        Integer cont;

        for(String boleto: boletos){
            //Valor de la terminación
            ultimo = Integer.parseInt("" + boleto.charAt(4));
            //Obtenemos el valor del valor
            cont = terminaciones.get(ultimo);
            //Si la clave no existía, ponemos un 1. Si no, aumentamos en 1 el valor
            if (cont == null){
                terminaciones.put(ultimo, 1);
            }else{
                terminaciones.put(ultimo, cont + 1);
            }
        }

        return terminaciones;
    }
}
