import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calculo("5 1 2 + 4 * + 3 -"));
    }
    public static boolean esNumero(String cadena){
        return Character.isDigit(cadena.charAt(0));
    }
    public static int calculo(String expresion){
        String terminos[] = expresion.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])){
                numero = Integer.valueOf(terminos[i]);
                //numero = Integer.toString("" + terminos[i]);
                pila.push(numero);
            }else{
                n2 = pila.pop();
                n1 = pila.pop();
                if (terminos[i].equals("+")){
                    pila.push(n1 + n2);
                } else if (terminos[i].equals("-")) {
                    pila.push(n1 - n2);
                } else if (terminos[i].equals("*")) {
                    pila.push(n1 * n2);
                }else{
                    pila.push(n1 / n2);
                }

            }
        }
        return pila.pop();
    }
}
