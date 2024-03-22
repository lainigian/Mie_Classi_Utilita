/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._mie_classi_utilita;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gian
 */
public class Menu 
{
    private String [] elencoVoci;
    private int numeroVoci;
    
    /**
     * Costruttore
     * 
     * @param elencoVoci Array di stringhe. Ogni stringa dell'array rappresenta una voce del menu
     */
    public Menu(String[] elencoVoci)
    {
        //Copio le voci parametro nell'elenco voci attributo
        numeroVoci=elencoVoci.length;
        this.elencoVoci=new String[numeroVoci];
        for(int i=0;i<this.numeroVoci;i++)
            this.elencoVoci[i]=elencoVoci[i];
    }
    
    public void visualizzaMenu()
    {
        System.out.println("MENU:");
        for(int i=0;i<this.numeroVoci;i++)
        {
            System.out.println(i+")\t"+ elencoVoci[i]);
        }
    }
    
    public int getNumeroVoci()
    {
        return elencoVoci.length;
    }
    
    public int sceltaMenu()
    {
        String sceltaStringa;
        boolean sceltaOk=true;
        int scelta=0;
        ConsoleInput tastiera=new ConsoleInput();
       
        do
        {
            System.out.println("Scegli --> ");
            
            try 
            {
                sceltaOk=false;
                scelta=tastiera.readInt();
                if (scelta<0 || scelta>=elencoVoci.length)
                     {
                         sceltaOk=false;
                         System.out.println("Scelta non valida.");
                     }
                else
                    sceltaOk=true;
            } 
            catch (IOException ex) 
            {
                System.out.println("Errore dispositivo di input");
            } 
            catch (NumberFormatException ex) 
            {
                System.out.println("Input non corretto");
            }
        }while(!sceltaOk);
        
            /*
                if (sceltaStringa.charAt(0)<'0' || sceltaStringa.charAt(0)>'9')
                {
                    System.out.println("Input non corretto. Inserire un numero!");
                    sceltaOk=false;
                }             

                else  //scelta è un numero
                {  
                     scelta=Integer.parseInt(""+sceltaStringa.charAt(0));
                     if (scelta<0 || scelta>elencoVoci.length)
                     {
                         sceltaOk=false;
                         System.out.println("Scelta non valida.");
                     }        
                }
        */
        
        return scelta;     
    }
}
