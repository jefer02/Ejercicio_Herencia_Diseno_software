package Model;

public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {
        super();
        this.duracionMinutos = 0;
    }

    public Disco(String titulo, double precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(float duracionMinutos, String titulo, double precio) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(float duracionMinutos) {
        super();
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}