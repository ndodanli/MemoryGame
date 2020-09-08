/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author dream
 */
public  class KutuOlusturma extends JToggleButton{
    public static List<JToggleButton> kutuErisim = new ArrayList<JToggleButton>();
    public static List<Integer> kutuDegerErisim = new ArrayList<>();
    public void kutuOlustur(List<String> kutuDegerString,int kutuAdet,JPanel kutuPaneli,KutuDinleyici kdinleyici){
        JToggleButton[] kutular = new JToggleButton[kutuAdet];
        kutuPaneli.setLayout(new GridLayout(kutuAdet/2, kutuAdet/2));
        kutuPaneli.setBackground(Color.WHITE);
        for (int i = 0; i < kutuAdet; i++) {
            kutular[i] = new JToggleButton(kutuDegerString.get(i));
            kutular[i].setBackground(Color.WHITE);
            kutular[i].addActionListener(kdinleyici);
            kutular[i].setActionCommand(Integer.toString(i));
            kutuErisim.add(kutular[i]);
            kutuDegerErisim.add(Integer.parseInt(kutuDegerString.get(i)));
            kutuPaneli.add(kutular[i]);
        }      
    }
    public List<JToggleButton> kutuGonder(){
        return kutuErisim;
    }
    public List<Integer> kutuDegerGonder(){
        return kutuDegerErisim;
    }
}
