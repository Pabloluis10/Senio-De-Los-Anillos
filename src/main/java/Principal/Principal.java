package Principal;

import Principal.Jugar.Juego;
import java.util.Scanner;

/*
 * @author pabloluis
 */
public class Principal {

    //variable
    private static Juego juego;
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        juego = new Juego();
        System.out.println("\n\n========== BIENVENIDO A EL JUEGO DEL SEÑOR DE LOS AÑILLOS ==========");
        menu();
    }
    
    public static void menu(){
        int opcion;
        do{
            System.out.println("\n==================== menú ====================");
            System.out.println("1) Ingresar un personaje");
            System.out.println("2) Iniciar Pelea");
            System.out.println("3) Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    juego.ingresarPersonaje();
                    break;
                case 2:
                    juego.pelear();
                    break;
                case 3:
                    System.out.println("Ha finalizado el juego.");
                    break;
                default: 
                    System.out.println("No ha ingresado ningúna opción valida");
                    break;
            }
        } while (opcion != 3);
    }
    
}
