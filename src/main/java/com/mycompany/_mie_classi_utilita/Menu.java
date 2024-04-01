/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._mie_classi_utilita;

import java.io.IOException;

/**
 * Classe che rappresenta un menu di scelta fra varie voci di un'applicazione.
 * Ad gni voce del menu corrisponde un numero intero a partire da 0
 * Un oggetto istanza di questa classe consente di mostrare il menu e consente di ottenere un numero intero
 * che rappresente l'indice della voce scelta dall'utente:
 * Esempio:
 *  0   Esci
 *  1   fai qualcosa
 *  2   Fai qualcos'altro.
 * 
 * La classe ha come attributi:
 *  elencoVoci: un array di stringhe che rappresenta l'elenco delle voci che costituiscono il menu di scelta
 * il numero totale di voci di cui è composto l'elenco di voci.
 * 
 * Il costruttore riceve come parametro l'elenco delle voci
 * La classe consente di :
 * visualizzare il menu
 * far scegliere all'utente una voce del menu
 * 
 * La classe utilizza la classe ConsoleInput() per acquisire dati dalla tastiera
 * pertanto tale classe deve essere nello stesso package di questa classe.
 * 
 *
 * 
 * @author gian
 */
public class Menu 
{
    private String [] elencoVoci;
    private int numeroVoci;
    
    /**
     * Costruttore
     * @param elencoVoci array di stringhe che rappresenta le voci del menu. La prima stringa corrisponderà alla voce numero 0, la seconda stringa 
     * alla voce numero 1 ecc..
     * 
     */
    public Menu(String[] elencoVoci)
    {
        //Copio le voci parametro nell'elenco voci attributo
        numeroVoci=elencoVoci.length;
        this.elencoVoci=new String[numeroVoci];
        for(int i=0;i<this.numeroVoci;i++)
            this.elencoVoci[i]=elencoVoci[i];
    }
    
    /**
     * mostra le possibili voci del menu scelte
     */
    public void visualizzaMenu()
    {
        System.out.println("MENU:");
        for(int i=0;i<this.numeroVoci;i++)
        {
            System.out.println(i+")\t"+ elencoVoci[i]);
        }
    }
    
    /**
     * Chiede all'utente di scegliere una voce del menu
     * Controlla che il valore inserito dall'utente sia 
     * un numero compreso fra 0 e il numero di voci del menu -1
     * 
     * @return L'idice della voce scelta
     * @throws IOException nel caso non sia possibile leggere da tastiera
     */
    public int sceltaMenu() throws IOException
    {
        String sceltaStringa;
        boolean sceltaOk=true;
        int scelta=0;
        ConsoleInput tastiera=new ConsoleInput();
       
        do
        {
            System.out.println("Scegli --> ");
            sceltaOk=true;
            try
            {
                scelta=tastiera.readInt();
                if (scelta<0 || scelta>=numeroVoci)
                {
                    System.out.println("Scelta non valida");
                    sceltaOk=false;
                }
                    
            } 
            
            catch (NumberFormatException ex) 
            {
                sceltaOk=false;
                System.out.println("Input non conforme. Inserire un numero.");
            }
        }while (!sceltaOk)    ;
 

        return scelta;     
    }
}
