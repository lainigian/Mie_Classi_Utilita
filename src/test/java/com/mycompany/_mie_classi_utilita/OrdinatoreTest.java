/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._mie_classi_utilita;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author gian
 */
public class OrdinatoreTest {
    
  
    
    public OrdinatoreTest() {
    }

   
    
    /**
     * Test of scambia method for array of int, of class Ordinatore.
     */
    @Test
    public void testScambia_3args_1() 
    {
        
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array null");
        
        //Array posizione 1 negativa
        int[] atteso2={10,3,-1,0,-2};
        int[] attuale2={10,3,-1,0,-2};
        int pos1=-1;
        int pos2=4;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
        //Array posizione 2 negativa
        pos1=2;
        pos2=-1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
        //Array posizione 1 maggiore del numero di elementi
        pos1=5;
        pos2=1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
         //Array posizione 2 maggiore del numero di elementi
        pos1=1;
        pos2=5;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
         //Array scambio elementi con successo
        
        int[] atteso3={2,3,-1,0,10};
        int[] attuale3={10,3,-1,0,2};
        pos1=0;
        pos2=4;
        Ordinatore.scambia(attuale3, pos1, pos2);
        assertArrayEquals(attuale3,atteso3, "Array={ 10,3,-1,0,-2}");
        
    }
    

    /**
     * Test of scambia method for array of String, of class Ordinatore.
     */
    @Test
    public void testScambia_3args_2()
    {
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array null");
        
        //Array posizione 1 negativa
        String[] atteso2={"cane","ciao lao","casa","zorro", "Pinna"};
        String[] attuale2={"cane","ciao lao","casa","zorro", "Pinna"};
        int pos1=-1;
        int pos2=4;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
        //Array posizione 2 negativa
        pos1=2;
        pos2=-1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
        //Array posizione 1 maggiore del numero di elementi
        pos1=5;
        pos2=1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
         //Array posizione 2 maggiore del numero di elementi
        pos1=1;
        pos2=5;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
      
        String[] atteso3={"Pinna","ciao lao","casa","zorro", "cane"};
        String[] attuale3={"cane","ciao lao","casa","zorro", "Pinna"};
        pos1=0;
        pos2=4;
        Ordinatore.scambia(attuale3, pos1, pos2);
        assertArrayEquals(attuale3,atteso3, "{\"Pinna\",\"ciao lao\",\"casa\",\"zorro\", \"Cane\"}");
        
    }

    /**
     * Test of selectionSortCrescente of int method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortCrescente_intArr() 
    {
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.selectionSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={10}");
        
        //array con vari elementi che si ripetono
        int[] atteso3={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale3={10,10,0,-2,4,-2,1, 19,-5,-5,88,9,88,-2,-2 };
        attuale3=Ordinatore.selectionSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
        
        //array iniziale ordinato decrescente
        int[] atteso4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        attuale4=Ordinatore.selectionSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
        
         //array iniziale già ordinato crescente
        int[] atteso5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale5=Ordinatore.selectionSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");

    }

    /**
     * Test of selectionSortDecrescente of int method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortDecrescente_intArr() 
    {
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.selectionSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={10}");
        
        //array con vari elementi che si ripetono
        int[] atteso3={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale3={10,10,0,-2,4,-2,1, 19,-5,-5,88,9,88,-2,-2 };
        attuale3=Ordinatore.selectionSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
        
        //array iniziale ordinato crescente
        int[] atteso4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale4=Ordinatore.selectionSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5}");
        
         //array iniziale già ordinato decrescente
        int[] atteso5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        int[] attuale5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        attuale5=Ordinatore.selectionSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");

    }

    /**
     * Test of selectionSortCrescente of String method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortCrescente_StringArr() 
    {
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.selectionSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
        
        //array con vari elementi che si ripetono
        String[] atteso3={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.selectionSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,Pinna,pinna,Pinna,zorro,zorro}");
        
        //array iniziale ordinato decrescente
        String[] atteso4={"","baffo","cane","cane", "casa","ciao lao","ciao lao","Pinna","pinna","Pinna","zorro","zorro"};
        String[] attuale4={"zorro","zorro","Pinna","Pinna", "pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.selectionSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");
        
         //array iniziale già ordinato crescente
        String[] atteso5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.selectionSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");   
    }

    /**
     * Test of selectionSortDecrescente of String method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortDecrescente_StringArr() 
    {
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
      
        //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.selectionSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
        
        //array con vari elementi che si ripetono
        String[] atteso3={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.selectionSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,Pinna,pinna,Pinna,zorro,zorro}");
       
         
         //array iniziale  ordinato crescente
        String[] atteso5={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.selectionSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");   
    
         //array iniziale ordinato decrescente
        String[] atteso4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        String[] attuale4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.selectionSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");
    
    }

    /**
     * Test of bubbleSortCrescente of int[] method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortCrescente_intArr() 
    {
        
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.bubbleSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={10}");
        
        //array con vari elementi che si ripetono
        int[] atteso3={-5,-5,-2,-2,-2,-2,0,1,4,9,10,10, 19,88,88};
        int[] attuale3={10,10,0,-2,4,-2,1,19,-5,-5,88,9,88,-2,-2};
        attuale3=Ordinatore.bubbleSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
      
        
        //array iniziale ordinato decrescente
        int[] atteso4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        attuale4=Ordinatore.bubbleSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
        
        
         //array iniziale già ordinato crescente
        int[] atteso5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale5=Ordinatore.bubbleSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
  
    }

    /**
     * Test of bubbleSortDecrescente of int[] method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortDecrescente_intArr() 
    {
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.bubbleSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={10}");
        
        //array con vari elementi che si ripetono
        int[] atteso3={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale3={10,10,0,-2,4,-2,1, 19,-5,-5,88,9,88,-2,-2 };
        attuale3=Ordinatore.bubbleSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
        
        //array iniziale ordinato crescente
        int[] atteso4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale4=Ordinatore.bubbleSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5}");
     
         //array iniziale già ordinato decrescente
        int[] atteso5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        int[] attuale5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        attuale5=Ordinatore.bubbleSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
    }

    /**
     * Test of bubbleSortCrescente of String method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortCrescente_StringArr() 
    {
        
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
       
        //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.bubbleSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
        
        //array con vari elementi che si ripetono
        String[] atteso3={"","baffo","cane","cane", "casa","ciao lao","ciao lao","Pinna","pinna","Pinna","zorro","zorro"};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.bubbleSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,Pinna,pinna,Pinna,zorro,zorro}");
        
        //array iniziale ordinato decrescente
        String[] atteso4={"","baffo","cane","cane", "casa","ciao lao","ciao lao","Pinna","Pinna","pinna","zorro","zorro"};
        String[] attuale4={"zorro","zorro","Pinna","Pinna", "pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.bubbleSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,Pinna,Pinna,pinna,zorro,zorro}");
        
         //array iniziale già ordinato crescente
        String[] atteso5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.bubbleSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}"); 
   
    }

    /**
     * Test of bubbleSortDecrescente of String method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortDecrescente_StringArr() 
    {
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
        //Array= null
        atteso=null;
        attuale=null;
        attuale=Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
      
        //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.bubbleSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
        
        //array con vari elementi che si ripetono
        String[] atteso3={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.bubbleSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,Pinna,pinna,Pinna,zorro,zorro}");
       
         
         //array iniziale  ordinato crescente
        String[] atteso5={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.selectionSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");   
    
         //array iniziale ordinato decrescente
        String[] atteso4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        String[] attuale4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.selectionSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={\"\",baffo,cane,cane,casa,ciao lao,ciao lao,pinna,Pinna,Pinna,zorro,zorro}");
    
    }
    
}
