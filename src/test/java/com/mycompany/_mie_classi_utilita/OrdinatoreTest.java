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
     * Test of scambia method, of class Ordinatore.
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
        assertArrayEquals(attuale2,atteso, "Array={ 10,3,-1,0,-2}");
        
    }
    

    /**
     * Test of scambia method, of class Ordinatore.
     */
    @Test
    public void testScambia_3args_2() {
    }

    /**
     * Test of selectionSortCrescente method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortCrescente_intArr() {
    }

    /**
     * Test of selectionSortDecrescente method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortDecrescente_intArr() {
    }

    /**
     * Test of selectionSortCrescente method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortCrescente_StringArr() {
    }

    /**
     * Test of selectionSortDecrescente method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortDecrescente_StringArr() {
    }

    /**
     * Test of bubbleSortCrescente method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortCrescente_intArr() {
    }

    /**
     * Test of bubbleSortDecrescente method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortDecrescente_intArr() {
    }

    /**
     * Test of bubbleSortCrescente method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortCrescente_StringArr() {
    }

    /**
     * Test of bubbleSortDecrescente method, of class Ordinatore.
     */
    @Test
    public void testBubbleSortDecrescente_StringArr() {
    }
    
}
