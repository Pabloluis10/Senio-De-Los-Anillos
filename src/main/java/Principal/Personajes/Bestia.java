package Principal.Personajes;

/*
 * @author pabloluis
 */
public class Bestia extends Personaje {
    
    private String [] figura;

    public Bestia(int vida, String nombre, int armadura) {
        super(vida, nombre, armadura, 90, 1);
        figura = iniciarFigura();
    }
    
    private String [] iniciarFigura(){
        String [] Figura ={ "               |       |       ",
                            "           -----------------   ",
                            "          *                 *  ",
                            "         *     0       0     * ",
                            "        *          ?          *",
                            "\\ \\   *                     *",
                            " \\ \\   *                   * ",
                            "  \\ \\   *                 *  ",
                            "   \\ \\   -----------------   ",
                            "    \\ \\      |      |        ",
                            "     \\ \\------------------   ",
                            "      \\ \\*****************   ",
                            "       ------------------/     ",
                            "           |   BESTIA   |      ",
                            "           |            |      ",
                            "           |            |      ",
                            "           |            |      ",
                            "           |____________|      ",
                            "            |  |    |  |       ",
                            "            |  |    |  |       ",
                            "            |  |    |  |       ",
                            "            |  |    |  |       ",
                            "            |  |    |  |       ",
                            "            |  |    |  |       ",
                            "          .-*  |    |  *-.     ",
                            "        -*_____|    |_____*-   ",};
        return Figura;
    }

    public String[] getFigura() {
        return figura;
    }
}
