import java.util.ArrayList;
import java.util.HashMap;

public class PaisCapital {
    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "París");

        String capital = dameCapital(paises, "Otro");

        if (capital != null)
            System.out.println(capital);
        else
            System.out.println("El país no existe");
    }
    public static String dameCapital(HashMap<String, String> paises, String pais){
        return paises.get(pais);
    }
}
