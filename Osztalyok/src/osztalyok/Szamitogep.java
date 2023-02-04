
package osztalyok;

/**
 *
 * @author Székely Balázs
 */
public class Szamitogep {
    private double szabadMemoria;
    private boolean bekapcsolva;

    public Szamitogep(double szabadMemoria, boolean bekapcsolva) {
        this.szabadMemoria = szabadMemoria;
        this.bekapcsolva = bekapcsolva;
    }

    public Szamitogep() {
        this(1024, false);
    }
    
    
}
