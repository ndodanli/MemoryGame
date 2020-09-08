/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dream
 */
public class KutuDinleyici implements ActionListener {
    OyunKontrol ok = new OyunKontrol();
    String kutuSecilen;
    int kutuSecilenInt;
    public void actionPerformed(ActionEvent e) {
        kutuSecilen = e.getActionCommand();
        kutuSecilenInt = Integer.parseInt(kutuSecilen);
        ok.kontrolEt(kutuSecilenInt);
        OyunKontrol.sayac++;
        
        
    }   
}
