package repasoRefuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(468));
        System.out.println(esHyperpar(3456));
    }
    public static boolean esHyperpar(int numero) {
        int digito;
        //Mientras nos queden dígitos
        while (numero > 0){
            //Al hacer el módulo, nos queda justo el resto de la división. Es decir
            //un número entre 0 y 9
            digito = numero % 10;
            if (digito % 2 != 0){
                return false;
            }
            //Ahora dividimos entre 10 para que continúe con el siguiente número
            numero /= 10;
        }

        return true;
    }
    public static boolean esHyperpar2(int numero){
        //Pasamos el número a String para pasar de un entero a un string
        String num = String.valueOf(numero);
        char digito;
        int entero;
        // Recorremos uno a uno los caracteres del número
        for (int i = 0; i < num.length(); i++) {
            //Cogemos el carácter iésimo
            digito = num.charAt(i);
            //Lo pasamos a entero y comprobamos si es par o impar
            //Si es impar es que el número no es hyperpar y acabamos
            entero = Integer.parseInt("" + digito);
            if (entero % 2 != 0){
                return false;
            }
        }
        return true;
    }
    
}
