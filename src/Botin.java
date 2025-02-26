import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static void main(String[] args) {
        Map<Integer, String> reparto = repartir(2, new String[]{"10", "20", "100", "50", "200"});
        System.out.println(reparto.toString());
    }
    public static Map<Integer, String> repartir(int numLadrones, String[] billetes){
        Map<Integer, String> reparto = new HashMap<>();
        int leTocaA;
        String billete;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billete = billetes[i];
            //Para que sea un reparto circular (que vuelva a 0 una vez alcanzado numLadrones
            //Por eso hace falta un for: porque se usa la variable contador i
            leTocaA = i % numLadrones;
            botin = reparto.get(leTocaA);
            if (botin == null){
                reparto.put(leTocaA, billete);
            }else{
                reparto.put(leTocaA, botin + " " + billete);
            }
            //O también así
            //reparto.put(leTocaA, reparto.getOrDefault(leTocaA, billete) + " " + billete);

        }
        return reparto;
    }
}
