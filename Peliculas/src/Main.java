import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public class Peliculas {


        String nombre;
        String genero;
        int anio;

        public Peliculas(String nombre, String genero, int anio, String director) {
            this.nombre = nombre;
            this.genero = genero;
            this.anio = anio;
            this.director = director;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getNombre() {
            return nombre;
        }

        public String getGenero() {
            return genero;
        }

        public int getAnio() {
            return anio;
        }

        public String getDirector() {
            return director;
        }

        String director;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menu de peliculas: ");
        System.out.println("1) Peliculas de accion");
        System.out.println("2) Peliculas de comedia");
        System.out.println("3) Peliculas de terror");
        System.out.println("4) K-doramas");
        System.out.println("Elija una opcion:  ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            Peliculas_accion lista = new Peliculas_accion();
            lista.Accion();

        }

        if(opcion == 2){
            System.out.println("Peliculas de accion");
        }
        if(opcion == 3){
            System.out.println("Peliculas de terror");
        }
        if(opcion ==4){
            System.out.println("k-doramas");
        }




    }
}