import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String marca;
        do{
            marca = sc.nextLine();

            if (marca.isEmpty()) break;

            marcas.add(marca);

        }while(true);

        Collections.sort(marcas);
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }

    }
}
