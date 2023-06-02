import java.util.Scanner;
public class Peliculas_comedia {
    public void comedia(){
        System.out.println("Las peliculas de comedia son: ");
        System.out.println("Zoolander");
        System.out.println("¿Quien carajo son los Miller");
        System.out.println("Gato con botas");
        System.out.println("Comando especial");

        if (opcion == 1) {
            Metodo accion = new Metodo("Zoolander", "comedia",2001, "Ben Stiller");
            accion.mostrar();
            Metodo accion1 = new Metodo("¿Quien carajo son los Miller", "comedia",2007," Zack Snyder");
            accion1.mostrar();
            Metodo accion2 = new Metodo("Vikingos","comedia", 2013, "Michael Hirst");
            accion2.mostrar();
            Metodo accion3 = new Metodo("Gato con botas","comedia",2016,"Robert Zemeckis");
            accion3.mostrar();

        }

    }

}
