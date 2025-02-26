package repasoRefuerzoII;

public class Mult {
    public static void main(String[] args) {
        int[] numeros = new int[]{0, 1, 2, 3, 0, 4, 5, 0, 7};
        int mult = 1;
        int primero = 0, ultimo = 0;
        int primeroMax = -1, ultimoMax = -1;
        for (int i = 1; i < numeros.length; i++) {
            mult *= numeros[i];
            if (mult == 0){
                ultimo = i - 1;
                if (ultimo > ultimoMax) ultimoMax = ultimo;
                mult = 1;
            }
            if (numeros[i-1] == 0) {
                primero = i;
                if (primero > primeroMax) primeroMax = primero;
            }
        }
        System.out.println(primeroMax);
        System.out.println(ultimoMax);

    }
}
