package Principal.Personajes;

/*
 * @author pabloluis
 */
public class Orco extends Bestia {

    public Orco(String nombre) {
        super(300, nombre, 25);
    }

    @Override
    public void atacarRival(Personaje rival) {
        int potenciaOfenciva = valorAtaque(0);
        int armaduraRival =rival.getArmadura()- (int)(rival.getArmadura()*0.1);//reducción de armadura oponente
        if(potenciaOfenciva > armaduraRival){
            int daño = potenciaOfenciva - armaduraRival;
            if(rival.getVida()< daño){//si la vida es menor al daño que se le hara al rival
                daño = rival.getVida();//para dejar la vida en 0
            }
            rival.recibirDaño(daño);
        } 
    }    
}
