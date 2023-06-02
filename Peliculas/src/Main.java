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
        System.out.println("4) Peliculas de K-dramas");
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
            Metodo comedia= new Metodo("El exorcista","Terror sobrenatural",1973,"William Friedkin");
            comedia.mostrar();
            Metodo comedia1= new Metodo("El resplandor","Terror psicológico",1980,"Stanley Kubrick");
            comedia1.mostrar();
            Metodo comedia2= new Metodo("El proyecto de la bruja de Blair","Terror de metraje encontrado",1999,"Daniel Myrick");
            comedia2.mostrar();
            Metodo comedia3 = new Metodo("El conjuro","Terror paranormal",2013,"James Wan");
            comedia3.mostrar();
        }
        if(opcion ==4){
            System.out.println("K-dramas:");
            Metodo comedia= new Metodo("Boys Over Flowers","Romance, Comedia, Drama",2009,"Jeon Ki-sang");
            comedia.mostrar();
            Metodo comedia1= new Metodo("Descendants of the Sun","Romance, Drama, Acción",1980,"Lee Eung-bok");
            comedia1.mostrar();
            Metodo comedia2= new Metodo("Goblin","Fantasía, Romance, Drama",1999,"Lee Eung-bok");
            comedia2.mostrar();
            Metodo comedia3 = new Metodo("Crash Landing on You","Romance, Comedia, Drama",2013,"Lee Jeong-hyo");
            comedia3.mostrar();
        }

    }
}