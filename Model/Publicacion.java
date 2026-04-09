package Model;

public class Publicacion {
    protected String titulo;
    protected double precio;

    public Publicacion() {
        this.titulo = "";
        this.precio = 0.0;
    }

    public Publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }
}