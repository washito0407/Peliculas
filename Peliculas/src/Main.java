// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public class Peliculas{
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

}