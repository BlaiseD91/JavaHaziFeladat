
package osztalyok;

/**
 *
 * @author Székely Balázs
 * 
 * 6. feladat - Harcos osztály megvalósítása
 */
public class Harcos {
    
    private String nev;
    private int eletero;
    private int harciEro;

    public Harcos(String nev, int eletero, int harciEro) {
        this.nev = nev;
        this.eletero = eletero;
        this.harciEro = harciEro;
    }

    @Override
    public String toString() {
        return "A harcos neve: "+this.getNev()+" életereje: "+this.getEletero()+" harci ereje: "+this.getHarciEro();
    }
    
    
    
    public boolean harcol(Harcos harcos){
        boolean halal = false;
        this.eletero -= harcos.harciEro;
        harcos.eletero -= this.harciEro;
        if(this.getEletero() <= 0 || harcos.getEletero() <= 0) halal = true;
        return halal;
    }

    public String getNev() {
        return nev;
    }

    public int getEletero() {
        return eletero;
    }

    public int getHarciEro() {
        return harciEro;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setHarciEro(int harciEro) {
        this.harciEro = harciEro;
    }
    
    
    
    
    
    
}
