import java.util.Scanner;
public class Peliculas_comedia {
    public void comedia() {
        System.out.println("Las peliculas de comedia son: ");
        System.out.println("Zoolander");
        System.out.println("¿Quien carajo son los Miller");
        System.out.println("Gato con botas");
        System.out.println("Comando especial");

        Scanner entrada = new Scanner(System.in);
        int opcion;

        if (opcion == 2) {
            Metodo accion = new Metodo("Zoolander", " comedia", 2001, " Ben Stiller");
            accion.mostrar();
            Metodo accion1 = new Metodo("¿Quien carajo son los Miller", " comedia", 2013, " Rawson Marshall Thurber");
            accion1.mostrar();
            Metodo accion2 = new Metodo("Gato con botas", " comedia", 1969, " Kimio Yabuki");
            accion2.mostrar();
            Metodo accion3 = new Metodo("Comando especial", " comedia", 2012, " Phil Lord y Christopher Miller");
            accion3.mostrar();
        }
    }
}
