/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._mie_classi_utilita;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gian
 */
public class App {

    public static void main(String[] args) 
    {
        String[] elencoVoci={
            "Esci",
            "Fai questo",
            "Fai quest'altro",
            "Fai questo",
            "Fai quest'altro",
            "Fai questo",
            "Fai quest'altro",
            "Fai questo",
            "Fai quest'altro",
            "Fai questo",
            "Fai quest'altro",
            "Fai questo",
            "Fai quest'altro",
        };
        Menu menu=new Menu(elencoVoci) ;  
        menu.visualizzaMenu();
        int scelta=menu.sceltaMenu();
        System.out.println("Scelta= "+scelta);
        
      
    }
}
