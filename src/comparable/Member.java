package comparable;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member other) {

        //Si mi altura es igual a la del otro, devuelve 0. Por tanto, no se toca
        if (this.height == other.getHeight()) {
            return 0;
        } else if (this.height > other.getHeight()) {
            //Si mi altura es mayor, pasa adelante
            return 1;
        } else {
            //Si mi altura es menor, pasa atrás
            return -1;
        }
        //También se puede hacer de forma resumida
        //return this.height - other.getHeigh();
        //Y si queremos ordenar de mayor a menor
        //return other.getHeight() - this.height;
        // Otro forma de hacerlo sería
        //return Integer.compare(this.getHeight(), other.getHeight());
    }
}
