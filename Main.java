import Model.Libro;
import Model.Disco;
import Model.Video;
import Model.Idioma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido de la editorial!");
        System.out.println("Vamos a crear un libro, un disco y un video.");

        System.out.println("Ingrese el titulo del libro:");
        String titulo = input.nextLine();

        System.out.println("Ingrese el precio del libro:");
        double precio = input.nextDouble();

        System.out.println("Ingrese el anio de publicacion del libro:");
        int anioPublicacion = input.nextInt();

        System.out.println("Ingrese el numero de paginas del libro:");
        int numeroPaginas = input.nextInt();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);

        input.nextLine();

        System.out.println("Ingrese el titulo del disco:");
        String tituloDisco = input.nextLine();

        System.out.println("Ingrese el precio del disco:");
        double precioDisco = input.nextDouble();

        System.out.println("Ingrese la duracion del disco (minutos):");
        float duracionMinutos = input.nextFloat();

        Disco miDisco = new Disco(tituloDisco, precioDisco, duracionMinutos);

        input.nextLine();

        System.out.println("Ingrese el titulo del video:");
        String tituloVideo = input.nextLine();

        System.out.println("Ingrese el precio del video:");
        double precioVideo = input.nextDouble();

        System.out.println("Seleccione el idioma del video:");
        System.out.println("1. ESPANOL");
        System.out.println("2. INGLES");
        System.out.println("3. PORTUGUES");
        int opcionIdioma = input.nextInt();

        Idioma idiomaVideo;
        if (opcionIdioma == 2) {
            idiomaVideo = Idioma.INGLES;
        } else if (opcionIdioma == 3) {
            idiomaVideo = Idioma.PORTUGUES;
        } else {
            idiomaVideo = Idioma.ESPANOL;
        }

        System.out.println("Ingrese la duracion del video (horas):");
        float duracionHoras = input.nextFloat();

        Video miVideo = new Video(tituloVideo, precioVideo, idiomaVideo, duracionHoras);

        System.out.println("\nDatos ingresados:");
        miLibro.mostrar();
        miDisco.mostrar();
        miVideo.mostrar();

        input.close();
    }
}