public class Metodo {



        String nombre;
        String genero;
        int anio;
        String director;

        public Metodo(String nombre, String genero, int anio, String director) {
            this.nombre = nombre;
            this.genero = genero;
            this.anio = anio;
            this.director = director;
        }
    public void mostrar(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su genero es: "+ genero);
        System.out.println("El año de estreno es: "+ anio);
        System.out.println("Su director es: "+director);
        System.out.println("   ");
    }


    }

