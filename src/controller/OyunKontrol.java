/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import model.Kutular;

/**
 *
 * @author dream
 */
public class OyunKontrol {
    public static int sayac = 0, oyunBitisKontrol = 0;
    private int alinanPuan = 0;
    KutuOlusturma kutuOlusturma = new KutuOlusturma();
    Kutular kutular = new Kutular();
    List<Integer> kutularText = kutuOlusturma.kutuDegerGonder();
    List<JToggleButton> kutuErisimKontrol = kutuOlusturma.kutuGonder();
    List<Integer> kutuDegerler = new ArrayList<Integer>(); 
    public void kontrolEt(Integer kutuSecilenKontrol){ 
            kutuDegerler.add(sayac,kutuSecilenKontrol);   
            if(sayac%2 == 0){
            kutuErisimKontrol.get(kutuDegerler.get(sayac)).setText(Integer.toString(kutularText.get(kutuDegerler.get(sayac))));
            }else if(kutularText.get(kutuDegerler.get(sayac))== kutularText.get(kutuDegerler.get(sayac-1))){
            kutuErisimKontrol.get(kutuDegerler.get(sayac)).setText(Integer.toString(kutularText.get(kutuDegerler.get(sayac))));   
            alinanPuan+= 5;
                alinanPuan += 50;
                OyunKontrol.oyunBitisKontrol++;
                if(oyunBitisKontrol == kutuErisimKontrol.size()/2){
                    JOptionPane.showMessageDialog(null, "Oyun Bitti !", "Hafıza Oyunu", -1);
                }
            }else{
            kutuErisimKontrol.get(kutuDegerler.get(sayac-1)).setText(" ");
            alinanPuan -= 20;
        }         
    }
}
