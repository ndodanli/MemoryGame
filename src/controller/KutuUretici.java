/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Kutular;

/**
 *
 * @author dream
 */
public class KutuUretici {
    Kutular kutularModel = new Kutular();
    OyunBaslat oyunBaslat = new OyunBaslat();
    KutuOlusturma kolustur = new KutuOlusturma();
    KutuDinleyici kdinleyici = new KutuDinleyici();
    public void kutuUreticiMantigi(JPanel kutuPaneli, JTextField adet){
        List<Integer> kutuDegerGecici = new ArrayList<>(); 
        List<String> kutuDegerString = new ArrayList<>();
        Random rnd = new Random();      
        String geciciDegisken = adet.getText();
        int kutuAdet = Integer.parseInt(geciciDegisken);   
        if(kutuAdet % 2 == 1){
            kutuAdet++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < (kutuAdet/2); j++) {
            kutuDegerGecici.add(j);
            }
        }
            for (int i = 0; i < kutuAdet; i++){
            int geciciDegiskenKutu = kutuDegerGecici.get(rnd.nextInt(kutuDegerGecici.size()));  
            int indexKutu = kutuDegerGecici.indexOf(geciciDegiskenKutu);
            kutularModel.getKutuDeger().add(geciciDegiskenKutu);
            kutuDegerGecici.remove(indexKutu);    
            }

        for (int i = 0; i < kutularModel.getKutuDeger().size(); i++){
			kutuDegerString.add(i, String.valueOf(kutularModel.getKutuDeger().get(i)));
        }           
        
        kolustur.kutuOlustur(kutuDegerString, kutuAdet, kutuPaneli, kdinleyici);
    }
    public void oyunuBaslat(){
       oyunBaslat.oyunuBaslat();
    }    
}
