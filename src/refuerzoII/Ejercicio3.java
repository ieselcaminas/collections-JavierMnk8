package refuerzoII;

public class Ejercicio3 {
    public static void main(String[] args) {
        String numero = "2345";
        System.out.println(suma(numero));
    }
    public static String suma(String numero){
        int suma = 0;
        String res = "";
        //Recorremos el array
        for (int i = 0; i < numero.length(); i++) {
            //Acumulamos el valor del dígito iésimo
            suma += Integer.parseInt("" + numero.charAt(i));
            // Si no estamos en el último, imprimimos el dígito y el +
            // En otro caso, imprimimos el último + " = " + suma
            if (i < numero.length() - 1)
                res += numero.charAt(i) + " + ";
            else
                res += numero.charAt(i) + " = " + suma;
        }

        return res;


    }
}
