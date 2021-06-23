package Principal.Jugar;

import Principal.Personajes.Bestia;
import Principal.Personajes.Elfo;
import Principal.Personajes.Heroe;
import Principal.Personajes.Hobbit;
import Principal.Personajes.Humano;
import Principal.Personajes.Orco;
import Principal.Personajes.Trasgo;
import java.util.Scanner;

/*
 * @author pabloluis
 */

public class Juego {
    
    Scanner entrada = new Scanner(System.in);
    //variables 
    Heroe [] heroes;
    Bestia [] bestias;
    int posLibreHeroe;
    int posLibreBestia;
    
    public Juego() {
        posLibreHeroe = 0;
        posLibreBestia = 0;
        int cantHeroes;
        int cantBestias;
        System.out.println("========== Antes de iniciar el juego ingrese los siguientes datos ==========");
        System.out.print("\nCuantos heroes desea para el juego: ");
        cantHeroes = entrada.nextInt();
        System.out.print("Cuantas bestias desea para el juego: ");
        cantBestias = entrada.nextInt();
        heroes = new Heroe[cantHeroes];
        bestias = new Bestia[cantBestias];
    }
    
    public void ingresarPersonaje(){
        System.out.println("\n=============== Ingresar personaje ===============");
        System.out.println("Que tipo de personaje desea ingresar");
        System.out.println("1) Héroe Elfo");
        System.out.println("2) Héroe Hobbit");
        System.out.println("3) Héroe Humano");
        System.out.println("4) Bestia Orco");
        System.out.println("5) Bestia Trasgo");
        System.out.print("Ingrese opción:");
        int opcion;
        do{
            opcion = entrada.nextInt();
            if(opcion<1 || opcion>5){
                System.out.println("Ingreso una opción incorrecta vuela a ingresar una opción");
            }
        }while(opcion<1 || opcion >5);
        //verificamos que haya espacio libre para ingresar personaje
        if(opcion>=1 || opcion<=3){
            if(posLibreHeroe >= heroes.length){
                System.out.println("Ya no hay espacio para ingresar héroes");
                return;
            }
        }else{
            if(posLibreBestia >= bestias.length){
                System.out.println("Ya no hay espacio para ingresar bestias");
                return;
            }
        }
        
        String nombre;
        switch(opcion){
            case 1:
                System.out.print("Ingrese un nombre para el héroe Elfo: ");
                nombre = entrada.nextLine();
                heroes[posLibreHeroe] = new Elfo(nombre);
                posLibreHeroe++;
                break;
            
            case 2:
                System.out.print("Ingrese un nombre para el héroe Hobbit: ");
                nombre = entrada.nextLine();
                heroes[posLibreHeroe] = new Hobbit(nombre);
                posLibreHeroe++;
                break;
                
            case 3:
                System.out.print("Ingrese un nombre para el héroe Humano: ");
                nombre = entrada.nextLine();
                heroes[posLibreHeroe] = new Humano(nombre);
                posLibreHeroe++;
                break;
                
            case 4:
                System.out.print("Ingrese un nombre para la bestia Orco: ");
                nombre = entrada.nextLine();
                bestias[posLibreBestia] = new Orco(nombre);
                posLibreBestia++;
                break;
                
            case 5:
                System.out.print("Ingrese un nombre para la bestia Trasgo: ");
                nombre = entrada.nextLine();
                bestias[posLibreBestia] = new Trasgo(nombre);
                posLibreBestia++;
                break;
        }
    }
    
    public void pelear(){
        int cantBatallas;
        if(posLibreHeroe<posLibreBestia){
            cantBatallas = posLibreHeroe;
        }else {
            cantBatallas = posLibreBestia;
        }
        int contadorPeleas=1;
        while(heroes[0] != null && bestias[0] != null){
            System.out.println("¡¡¡¡¡ ROUND "+contadorPeleas);
            for(int i=0; i<cantBatallas; i++){
                System.out.println("Pela entre"+heroes[i].getNombre()+" y "+bestias[i].getNombre());
                heroes[i].atacarRival(bestias[i]);
                bestias[i].atacarRival(heroes[i]);
                dibujarPelea(heroes[i], bestias[i]);
                
            }
            eliminarMuerto();
            contadorPeleas++;
        }
    }
    
    private void dibujarPelea(Heroe heroe, Bestia bestia){
        for(int i=0; i<heroe.getFigura().length; i++){
            System.out.println(heroe.getFigura()[i]+bestia.getFigura()[i]);
        }
        
        if(heroe.getVida()<=0 ){
            for(int i=0; i<heroe.getFiguraMuerto().length; i++){
                System.out.println(heroe.getFiguraMuerto()[i]);
            }
        }
        
        if(bestia.getVida()<=0){
            for(int i=0; i<bestia.getFiguraMuerto().length; i++){
                System.out.println(bestia.getFiguraMuerto()[i]);
            }
        }
    }
    
    private void eliminarMuerto(){
        
        //para heroes
        for(int i=0; i<(heroes.length-1); i++){
            if(heroes[i]==null || heroes[i].getVida() <= 0 ){
                heroes[i] = heroes[i+1];
                heroes[i+1] = null;
            }
        }
        //para bestias
        for(int i=0; i<(bestias.length-1); i++){
            if(bestias[i]==null || bestias[i].getVida() <= 0 ){
                bestias[i] = bestias[i+1];
                bestias[i+1] = null;
            }
        }
    }
}
