package comparable.analfabeto;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private int analfabetos;

    public Pais(String nombre, int analfabetos) {
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnalfabetos() {
        return analfabetos;
    }

    public void setAnalfabetos(int analfabetos) {
        this.analfabetos = analfabetos;
    }
    @Override
    public String toString(){
        return this.nombre + " - " + this.analfabetos;
    }
    @Override
    public int compareTo(Pais other){
        //Queremos ordenar de mayor a menor, por eso primero va other
        return other.analfabetos - this.analfabetos;
    }
}
