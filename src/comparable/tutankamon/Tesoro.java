package comparable.tutankamon;

public class Tesoro implements Comparable<Tesoro>{
    private int orden;
    private String nombre;
    private int valor;
    private int peso;

    public Tesoro(int orden, String nombre, int valor, int peso) {
        this.orden = orden;
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Tesoro other){
        //En el caso que el valor sea distinto, se ordena de mayor a menor
        if (this.valor != other.valor){
            return other.valor - this.valor;
        }else{
            //En caso de empate en el valor se ordena de menor a mayor peso
            if (this.peso != other.peso){
                return this.peso - other.peso;
            }else{
                //Y, por último, cuando todo es igual se ordena por en número de orden de menor a mayor
                return this.orden - other.orden;
            }
        }
    }
}
