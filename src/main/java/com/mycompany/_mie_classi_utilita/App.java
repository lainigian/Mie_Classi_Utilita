
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
       int[] arrayInteri={};
       String[] arrayStringhe={};
       int [] risultato;
       
       Ordinatore.scambia(arrayInteri, 0, 1);
       System.out.println("Array:");
       for (int i=0;i<arrayInteri.length;i++)
       {
           System.out.println(arrayInteri[i]+"\n");
       }
         Ordinatore.scambia(arrayStringhe, 0, 1);
        System.out.println("Array stringhe:");
       for (int i=0;i<arrayStringhe.length;i++)
       {
           System.out.println(arrayStringhe[i]+"\n");
       }
       
       arrayInteri=null;
       arrayStringhe=null;
       
       Ordinatore.scambia(arrayInteri, 0, 1);
       System.out.println("Array:");
      /* for (int i=0;i<arrayInteri.length;i++)
       {
           System.out.println(arrayInteri[i]+"\n");
       }
      */Ordinatore.scambia(arrayStringhe, 0, 1);
        System.out.println("Array stringhe:");
      /*for (int i=0;i<arrayStringhe.length;i++)
       {
           System.out.println(arrayStringhe[i]+"\n");
       }
      */
      
       String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
      attuale3=Ordinatore.bubbleSortCrescente(attuale3);
     for(int i=0;i<attuale3.length;i++)
     {
         System.out.println(attuale3[i]+"\n");
     }
        
      
    }
}

