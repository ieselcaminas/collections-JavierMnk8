import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Introduce el número de alumnos");
        int numAlumnos = numeroAlumnos();
        double media;
        int alumnosSuperior;
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println(numAlumnos);
        System.out.println("Introduce las alturas ");

        alturas = leerAlturas(alturas, numAlumnos);

        media = calcularMedia(alturas);
        System.out.println("Media: " + media);

        alumnosSuperior = calcularAlumnosAlturaSuperior(alturas, media);

        System.out.println("Alumnos de altura superior " + alumnosSuperior);
        System.out.println("Alumnos de altura inferior " + calcularAlumnosAlturaInferior(alturas, media));

    }
    public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numeroAlumnos){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);
        }
        return suma / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media){
        int cont = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media){
                cont++;
            }
        }
        return cont;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media){
        int cont = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media){
                cont++;
            }
        }
        return cont;
    }
}
