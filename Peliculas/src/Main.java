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