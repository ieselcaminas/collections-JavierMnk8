package comparable.felipe;

public class Tarea implements Comparable<Tarea> {
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return this.prioridad + " - " + this.duracion;
    }

    @Override
    public int compareTo(Tarea other){
        //Se ordena por prioridad de menor a mayor y en caso de empate por duración también de menor a mayor
        if (this.prioridad - other.prioridad == 0)
            return this.duracion - other.duracion;
        else
            return this.prioridad - other.prioridad;
    }
}
