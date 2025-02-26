import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {


		Map<String, ArrayList<String>> mapa = generarMapa();
		//Habría ahora que imprimir los datos...
    }
	public static Map<String, ArrayList<String>> generarMapa()throws IOException{
		//No va para examen
		BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
		String palabraDesordenada;
		String palabraOrdenada;
		ArrayList<String> listaDesordenadas;
		Map<String, ArrayList<String>> mapaAnagramas = new HashMap<>();

		while ((palabraDesordenada = reader.readLine())!=null) {
			//Obtenemos la palabra ordenada
			palabraOrdenada = alphabetize(palabraDesordenada);
			//Y comprobamos si está en el mapa (nos devolverá un ArrayList o null)
			listaDesordenadas = mapaAnagramas.get(palabraOrdenada);

			if (listaDesordenadas == null){
				//Si no está, creamos una lista vacía
				listaDesordenadas = new ArrayList<>();
				//Le añadimos la palabra
				listaDesordenadas.add(palabraDesordenada);
				//Y añadimos el anagrama junto a su lista
				mapaAnagramas.put(palabraOrdenada, listaDesordenadas);
			}else{
				//Añadimos la palabra a la lista
				listaDesordenadas.add(palabraDesordenada);
				// Y añadimos al mapa
				mapaAnagramas.put(palabraOrdenada, listaDesordenadas);
			}

		}
		reader.close();
		return mapaAnagramas;
	}
	private static String alphabetize(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

}
