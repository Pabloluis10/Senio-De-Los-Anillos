package Principal.Personajes;

import java.util.Random;

/*
  @author pabloluis
 */
public class Personaje {
    
    Random aleatorio = new Random();
    //Atributos
    protected int vida;
    protected int nombre;
    protected int armadura;
    protected final int LIMITE_ATAQUE;
    protected final int DADOS;
    protected String [] figuraMuerto;

    
    public Personaje(int vida, int nombre, int armadura, int LIMITE_ATAQUE, int DADOS) {
        this.vida = vida;
        this.nombre = nombre;
        this.armadura = armadura;
        this.LIMITE_ATAQUE = LIMITE_ATAQUE;
        this.DADOS = DADOS;
        this.figuraMuerto = iniciarFiguraMuerto();
    }
    
    //metodos
    public int valorAtaque(int aumento){
        int valorMasALto=0;
        for(int i=0; i<this.DADOS; i++){
            int aux = aleatorio.nextInt(LIMITE_ATAQUE+1);
            if(aux > valorMasALto){//elegimos el valor más alto
                valorMasALto = aux;
            }
        }
        return valorMasALto;
    }
    
    public void atacarRival(Personaje rival){
        int potenciaOfenciva = valorAtaque(0);
        if(potenciaOfenciva > rival.getArmadura()){
            int daño = potenciaOfenciva - rival.getArmadura();
            if(rival.getVida()< daño){//si la vida es menor al daño que se le hara al rival
                daño = rival.getVida();//para dejar la vida en 0
            }
            rival.recibirDaño(daño);
        }
    }
    
    public void recibirDaño(int daño){
        vida -= daño;
    }
    
    public String[] iniciarFiguraMuerto(){
        String [] figura = {"           ------   *- *\\ ",
                            " |*|_______------.*       * ",
                            " |_________       |    x  * ",
                            "  _________       | |-    * ",
                            " |  _______       |    X  * ",
                            " |.|       ------ *      /   ",
                            "           ------   * -*   "};
       
        return figura;
    }
    //getters 
    public int getVida() {
        return vida;
    }

    public int getNombre() {
        return nombre;
    }
    
    public int getArmadura(){
        return armadura;
    }

    public String[] getFiguraMuerto() {
        return figuraMuerto;
    }    
}
