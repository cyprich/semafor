
/**
 * Write a description of class Svetlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Svetlo {
    /**
     * Constructor for objects of class Svetlo
     */

    /*
     * "svetlo" je farebny kruh
     * "obrys" je cierny kruh, 
     *      je vacsi a posunuty tak, 
     *      aby vytvaral ako obrys svetla 
     */
    private Kruh svetlo;  // svetlo semaforu
    private Kruh obrys;  // cierny obrys okolo svetla pre lepsiu viditelnost
    private String farba;

    public Svetlo(int x, int y, String farba) {
        this.farba = farba;

        this.svetlo = new Kruh();
        this.svetlo.posunVodorovne(x - 20);
        this.svetlo.posunZvisle(y - 60);
        this.svetlo.zmenFarbu(farba);
        this.svetlo.zobraz();
        
        this.obrys = new Kruh();
        this.obrys.zmenPriemer(30 + 2);  // 2 px vacsie ako svetlo
        this.obrys.posunVodorovne(x - 20 - 1);  // posunute o 1 px dolava oproti svetlu, aby bol vycentrovany
        this.obrys.posunZvisle(y - 60 - 1);  // podobne ako v predchadzajucom riadku
        this.obrys.zmenFarbu("black");
        this.obrys.zobraz();
    }

    /* 
     * vypni - zmen farbu na bielu - vyzera, ze nie je zapnuty
     * zapni - zmen farbu na farbu zadanu v argumente konstruktora
     */

    public void zapni() {
        this.svetlo.zmenFarbu(this.farba);
    }

    public void vypni() {
        this.svetlo.zmenFarbu("white");
    }
}
