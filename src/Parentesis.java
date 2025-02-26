import java.util.LinkedList;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("}()"));
    }
    public static boolean esBalanceado(String cadena){
        boolean balanced;
        char caracter;
        char ultimo;

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            //Si son de apertura, lo pongo en la pila
            caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '['){
                pila.push(caracter);
            } else if (caracter == ')') {
                //Si por ejemplo si tenemos ()), cuando coja eñ segundo ), la pila estará vacía y cascará si
                //no lo compruebo
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                //Saco de la pila y compruebo si es '('. Si no es, acabo con false
                if (ultimo != '('){
                    return false;
                }
            } else if (caracter == '}') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                //Saco de la pila y compruebo si es '{'. Si no es, acabo con false
                if (ultimo != '{'){
                    return false;
                }
            }else if (caracter == ']') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                //Saco de la pila y compruebo si es '['. Si no es, acabo con false
                if (ultimo != '['){
                    return false;
                }
            }
        }

        return pila.isEmpty();

    }

}