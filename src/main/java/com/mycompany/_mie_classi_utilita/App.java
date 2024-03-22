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
        String nomeFile="provaTesto.txt";
        ConsoleInput consoleInput=new ConsoleInput();
        String s;
        TextFile f1 = null;
        //Scrittura su file
        try 
        {
            f1=new TextFile(nomeFile, 'W', true);
            do
            {
                System.out.println("Inserisci la frase da aggiungere al file di testo (premi solo invio per terminare)");
                s=consoleInput.readString();
                if (!s.equals(""))
                {
                    try 
                    {
                        f1.toFile(s);
                        System.out.println("Ok, frase scritta correttamente");
                    } 
                    catch (FileException ex) 
                    {
                        System.out.println(ex.toString());
                    }
                }
            }while(!s.equals(""));
            f1.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("Impossibile accedere al file in scrittura.");
        }
        
        
         //lettura da file
        System.out.println("Testo letto dal file: ");
        try
        {
           f1=new TextFile(nomeFile, 'R');
           while(true) 
            {
                 s=f1.fromFile();
                 System.out.println(s);
            }   
                
        }
        catch (IOException ex)
        {
            System.out.println("Impossibile accedere al file in lettura");
        } 
        catch (FileException ex) //Fine del file
        {
            try 
            {
                f1.close();
                //System.out.println(ex.toString());
            } 
            catch (IOException ex1) 
            {
  
            }   
        }
            
        
        
      
    }
}
