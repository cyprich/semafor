
/**
 * Write a description of class Semafor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semafor {
    /**
     * Constructor for objects of class Semafor
     */
    
    private int stav;
    /*
    * stav 1 - zelena
    * stav 2 - zlta
    * stav 3 - cervena
    * stav 4 - cervena a zlta
    */

    // 3 svetla semaforu, jedno pre kazdu farbu
    private Svetlo svetloCervena;
    private Svetlo svetloZlta;
    private Svetlo svetloZelena;

    private Obdlznik obdlznik;  // samotny semafor
    private Obdlznik obdlznikObrys;  // princip ako obrys v triede Svetlo

    public Semafor(int x, int y) {
        this.obdlznikObrys = new Obdlznik();
        this.obdlznikObrys.zmenStrany(50 + 2, 125 + 2);  // 2 px vacsi ako obdlznik
        this.obdlznikObrys.posunVodorovne(x - 60 - 1);  // posunuty o 1 px dolava oproti obdlzniku, aby bol vycentrovany
        this.obdlznikObrys.posunZvisle(y - 50 - 1);  // podobne ako v predchadzajucom riadku
        this.obdlznikObrys.zmenFarbu("black");
        this.obdlznikObrys.zobraz();
        
        this.obdlznik = new Obdlznik();
        this.obdlznik.zmenStrany(50, 125);
        this.obdlznik.posunVodorovne(x - 60);
        this.obdlznik.posunZvisle(y - 50);
        this.obdlznik.zmenFarbu("white");
        this.obdlznik.zobraz();

        

        this.svetloCervena = new Svetlo(20, 20, "red");
        this.svetloZlta = new Svetlo(20, 55, "yellow");
        this.svetloZelena = new Svetlo(20, 90, "green");
    
        this.stav = 0;
        this.zmenStav();
    }

    public void zmenStav() {
        /* 
         * ak je stav <= 4, tak sa zvysi o 1
         * ak je stav > 4, tak sa resetuje na 1 - algoritmus ide od zaciatku
         */
        if (this.stav < 4) {
            this.stav++;
        } else if (this.stav >= 4) {
            this.stav = 1;
        }
        
        switch (this.stav) {
            case 1:
                this.svetloCervena.vypni();
                this.svetloZlta.vypni();
                this.svetloZelena.zapni();
                break;
                
            case 2:
                this.svetloCervena.vypni();
                this.svetloZlta.zapni();
                this.svetloZelena.vypni();
                break;
                
            case 3:
                this.svetloCervena.zapni();
                this.svetloZlta.vypni();
                this.svetloZelena.vypni();
                break;
                
            case 4:
                this.svetloCervena.zapni();
                this.svetloZlta.zapni();
                this.svetloZelena.vypni();
                break;
        }
        
        
    }
}
