package Principal.Personajes;

/*
 * @author pabloluis
 */
public class Elfo extends Heroe{

    public Elfo(String nombre) {
        super(250, nombre, 50);
    }
    
    
    @Override
    public void atacarRival(Personaje rival){
        if(rival instanceof Orco){//si ataca a un orco
            int potenciaOfenciva = valorAtaque(10);
            if(potenciaOfenciva > rival.getArmadura()){
                int daño = potenciaOfenciva - rival.getArmadura();
                if(rival.getVida()< daño){//si la vida es menor al daño que se le hara al rival
                    daño = rival.getVida();//para dejar la vida en 0
                }
                rival.recibirDaño(daño);
            }
        }else {
            super.atacarRival(rival);
        }
    }
}
