import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

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
            Metodo accion = new Metodo("Robin Hood", "accion",2010, "Otto");
            accion.mostrar();
            Metodo accion1 = new Metodo("300", "accion",2007," Zack Snyder");
            accion1.mostrar();
            Metodo accion2 = new Metodo("Vikingos","accion", 2013, "Michael Hirst");
            accion2.mostrar();
            Metodo accion3 = new Metodo("Aliados","accion",2016,"Robert Zemeckis");
            accion3.mostrar();

        }

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

        if(opcion == 3){
            System.out.println("Peliculas de terror");
        }
        if(opcion ==4){
            System.out.println("k-doramas");
        }




    }
}