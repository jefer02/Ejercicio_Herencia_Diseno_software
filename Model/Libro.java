package Model;

public class Libro extends Publicacion {
	private int numeroPaginas;
	private int anioPublicacion;

	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.anioPublicacion = 0;
	}

	public Libro(String titulo, double precio, int anioPublicacion, int numeroPaginas) {
		super(titulo, precio);
		this.anioPublicacion = anioPublicacion;
		this.numeroPaginas = numeroPaginas;
	}

	public Libro(int numeroPaginas, int anioPublicacion, String titulo, double precio) {
		super(titulo, precio);
		this.numeroPaginas = numeroPaginas;
		this.anioPublicacion = anioPublicacion;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public void mostrar() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Libro{" +
				"titulo='" + titulo + '\'' +
				", precio=" + precio +
				", numeroPaginas=" + numeroPaginas +
				", anioPublicacion=" + anioPublicacion +
				'}';
	}
}
