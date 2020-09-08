/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JToggleButton;

/**
 *
 * @author dream
 */
public class OyunBaslat {
    KutuOlusturma kOlusturma = new KutuOlusturma();
    
    public void oyunuBaslat(){
        List<JToggleButton> kutulariGizle = kOlusturma.kutuGonder();
        for (int i = 0; i < kutulariGizle.size(); i++) {
            kutulariGizle.get(i).setText(" ");
        }
        
    }
    
}
