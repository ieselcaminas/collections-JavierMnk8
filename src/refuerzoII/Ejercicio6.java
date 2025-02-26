package refuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(100)); //false
        System.out.println(esHyperpar(202)); //true
        System.out.println(esHyperpar(1024)); //false
    }
    public static boolean esHyperpar(int numero){
        int numeroIesimo;
        while (numero > 0){
            /*
            Por ejemplo:
                129 % 10 = 9
                129 / 10 = 12
                ....
                12 % 10 = 2;
                12 / 10 = 1
             */
            //Al hacer el módulo, nos queda justo el resto de la división. Es decir
            //un número entre 0 y 9
            //Nos quedamos con el último dígito
            numeroIesimo = numero % 10;
            //Nos quedamos con el resto de dígitos
            numero /= 10;
            if (numeroIesimo % 2 != 0)
                return false;

        }
        return true;
    }
}