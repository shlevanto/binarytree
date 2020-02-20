package Tira0604_Binaarihakupuu;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        System.out.println("");
        
        
        ArrayList<Integer> luvut = new ArrayList<>();
        
        for (int i = 0; i < 1_000_000; i++) {
            luvut.add(i);
        }
        
        int summa = 0;
        int n = 20;
        
        for (int i = 0; i < n; i++) {
            Collections.shuffle(luvut);
            
            Puu parta = new Puu();
        
            for (int luku : luvut) {
                parta.lisaa(luku, null);
            }
        
            summa += parta.korkeus(parta.getJuuri());
        }
        
        System.out.println("Kesimääräinen korkeus kun suorituskertoja on " + n + ": " + summa / n);
        
        
        Puu puu = new Puu();
        
        puu.lisaa(7,null);
        puu.lisaa(4,null);
        puu.lisaa(8,null);
        puu.lisaa(5,null);
        
        System.out.println(puu.etsiAvain(5,puu.getJuuri()));
        
        puu.tulostaEsijarjestys(puu.getJuuri());
        System.out.println("");
        puu.tulostaSisajarjestys(puu.getJuuri());
        System.out.println("");
        puu.tulostaJalkijarjestys(puu.getJuuri());
        
        // testaamiseen käytetty luentokalvolla esitettyä binäärihakupuuta
        /*
        Puu puu = new Puu();
        
        int[] esim = new int[] {13,5,2,9,6,10,17,23,19};
        
        for (int i = 0; i < esim.length; i++) {
            puu.lisaa(esim[i]);
        }
        
        puu.tulostaEsijarjestys(puu.getJuuri());
        System.out.println("");
        puu.tulostaJalkijarjestys(puu.getJuuri());
        */
         
    }
}
