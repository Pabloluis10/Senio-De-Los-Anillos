package Principal.Personajes;

/*
 * @author pabloluis
 */
public class Hobbit extends Heroe {

    public Hobbit(String nombre) {
        super(200, nombre, 50);
    }

    @Override
    public void atacarRival(Personaje rival) {
        if(rival instanceof Trasgo){//si ataca a un orco
            int potenciaOfenciva = valorAtaque(-5);
            if(potenciaOfenciva > rival.getArmadura()){
                int daño = potenciaOfenciva - rival.getArmadura();
                if(rival.getVida()< daño){//si la vida es menor al daño que se le hara al rival
                    daño = rival.getVida();//para dejar la vida en 0
                }
                rival.recibirDaño(daño);
            }
        } else {
            super.atacarRival(rival); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
