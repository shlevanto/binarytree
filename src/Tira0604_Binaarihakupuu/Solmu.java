package Tira0604_Binaarihakupuu;

/**
 * @author levantsi
 */

public class Solmu {
    private int avain;
    private String data;
    private Solmu vasen; // vai int?
    private Solmu oikea; // vai int?
    private Solmu vanhempi; // vai int?

    public Solmu(int avain, String data, Solmu vasen, Solmu oikea, Solmu vanhempi) {
        this.avain = avain;
        this.data = data;
    }
    
    public int avain() {
        return this.avain;
    }
    
    public String data() {
        return this.data;
    }
    
    public Solmu getVasen() {
        return this.vasen;
    }
    
    public Solmu getOikea() {
        return this.oikea;
    }
    
    public void setVasen (Solmu solmu) {
        this.vasen = solmu;
    }
    
    public void setOikea (Solmu solmu) {
        this.oikea = solmu;
    }
    
    public String toString() {
        
        String dataString;
        
        if (this.data == null) {
            dataString = "";
        } else {
            dataString = ", " + this.data;
        }
        return Integer.toString(this.avain) + dataString;
    }
}
