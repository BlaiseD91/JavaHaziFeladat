
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 *
 * 4. feladat - Torta oszt�ly megval�s�t�sa
 * */
public class Torta {
    private int emeletek;
    private boolean kenve;

    public Torta(int emeletek, boolean kenve) {
        this.emeletek = emeletek;
        this.kenve = kenve;
    }

    public Torta() {
        this(1, false);
    }

    @Override
    public String toString() {
        return this.emeletek+" emelet magas torta, "+(this.kenve ? "kr�mmel kenve, " : "nincs kr�mmel kenve, ")+this.mennyiKatona()+ "kcal";
    }
    
    
    
    public void ujEmelet(){
        this.emeletek++;
    }
    
    public boolean kremmelMegken(){
        boolean siker = false;
        if(!this.kenve){
            this.kenve = true;
            siker = true;
        }
        return siker;
    }
    
    public int mennyiKatona(){
        return this.kenve ? (this.emeletek * 1000 * 2) : (this.emeletek * 1000);
    }
    
    
}
