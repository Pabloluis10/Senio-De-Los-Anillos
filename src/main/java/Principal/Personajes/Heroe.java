package Principal.Personajes;

/*
 * @author pabloluis
 */
public class Heroe extends Personaje {
    //atributos
    protected String [] figura;
    
    public Heroe(int vida, int nombre, int armadura) {
        super(vida, nombre, armadura, 100, 2);
        this.figura = iniciarFigura();
    }

    private String [] iniciarFigura(){
        String [] Figura ={ "       |       |               ",
                            "   -----------------           ",
                            "  *                 *          ",
                            " *     0       0     *         ",
                            "*          ?          *        ",
                            "*                     *     / /",
                            " *                   *     / / ",
                            "  *                 *     / /  ",
                            "   -----------------     / /   ",
                            "       |      |         / /    ",
                            "   --        --------- / /     ",
                            "  |  *****************/ /      ",
                            "   -|----------------- /       ",
                            "    |   HEROE    |             ",
                            "    |            |             ",
                            "    |            |             ",
                            "    |            |             ",
                            "    |____________|             ",
                            "     |  |    |  |              ",
                            "     |  |    |  |              ",
                            "     |  |    |  |              ",
                            "     |  |    |  |              ",
                            "     |  |    |  |              ",
                            "     |  |    |  |              ",
                            "   .-*  |    |  *-.            ",
                            " -*_____|    |_____*-          ",};
        return Figura;
    }

    public String[] getFigura() {
        return figura;
    }
}
