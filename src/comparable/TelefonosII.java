package comparable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = rellenaAgenda();
        for (Map.Entry<String, ArrayList<String>> contacto : agenda.entrySet()) {
            System.out.println(contacto.getKey());
            for(String telefono : contacto.getValue()){
                System.out.println("\t" + telefono);
            }
        }

    }
    public static Map<String, ArrayList<String>> rellenaAgenda(){
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("4564646");
        telefonos.add("898444");
        agenda.put("Pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("1114548");
        telefonos.add("2228748");
        agenda.put("Juan", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("88888");
        agenda.put("Mario", telefonos);

        return agenda;
    }
}
