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
    public void testScambiaArrayInteVuoto() 
    {
        //array vuoto
        int[] atteso={};
        int[] attuale={};
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array vuoto");
    }
    
    @Test
    public void testScambiaArrayInteNull() 
    {
         //Array= null
        int[] atteso=null;
        int[] attuale=null;
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array null");
    }
    
    @Test
    public void testScambiaArrayIntPos1Negativa() 
    {
         
        //Array posizione 1 negativa
        int[] atteso2={10,3,-1,0,-2};
        int[] attuale2={10,3,-1,0,-2};
        int pos1=-1;
        int pos2=4;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
    }
    
    @Test
    public void testScambiaArrayIntPos2Negativa() 
    {

        int[] atteso2={10,3,-1,0,-2};
        int[] attuale2={10,3,-1,0,-2};
        int pos1=2;
        int pos2=-1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
    }
    
    
    @Test
    public void testScambiaArrayIntPos1Maggiore() 
    {

        int[] atteso2={10,3,-1,0,-2};
        int[] attuale2={10,3,-1,0,-2};
  
        //Array posizione 1 maggiore del numero di elementi
        int pos1=5;
        int pos2=1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
    }
    
    @Test
    public void testScambiaArrayIntPos2Maggiore() 
    {
        int[] atteso2={10,3,-1,0,-2};
        int[] attuale2={10,3,-1,0,-2};
   
         //Array posizione 2 maggiore del numero di elementi
        int pos1=1;
        int pos2=5;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
        
    }

    @Test
    public void testScambiaArrayIntCorretto() 
    {
 
         //Array scambio elementi con successo
        
        int[] atteso3={2,3,-1,0,10};
        int[] attuale3={10,3,-1,0,2};
        int pos1=0;
        int pos2=4;
        Ordinatore.scambia(attuale3, pos1, pos2);
        assertArrayEquals(attuale3,atteso3, "Array={ 10,3,-1,0,-2}");
        
    }
    
 @Test
    public void testScambiaArrayStringVuoto() 
    {
     //array vuoto
        String[] atteso={};
        String[] attuale={};
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array vuoto");
        
    }
    
    @Test
    public void testScambiaArrayStringNull() 
    { 
        //Array= null
        String[] atteso=null;
        String[] attuale=null;
        Ordinatore.scambia(attuale, 1, 2);
        assertArrayEquals(atteso,attuale,"Array null");
    }
    
     @Test
    public void testScambiaArrayStringPos1Negativa() 
    { 
         
        //Array posizione 1 negativa
        String[] atteso2={"cane","ciao lao","casa","zorro", "Pinna"};
        String[] attuale2={"cane","ciao lao","casa","zorro", "Pinna"};
        int pos1=-1;
        int pos2=4;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2);
    }
    
    @Test
    public void testScambiaArrayStringPos2Negativa() 
    { 
         
        //Array posizione 1 negativa
        String[] atteso2={"cane","ciao lao","casa","zorro", "Pinna"};
        String[] attuale2={"cane","ciao lao","casa","zorro", "Pinna"};
         //Array posizione 2 negativa
        int pos1=2;
        int pos2=-1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2, "Array={ 10,3,-1,0,-2}");
    }
    
    @Test
    public void testScambiaArrayStringPos1Maggiore() 
    {  
        String[] atteso2={"cane","ciao lao","casa","zorro", "Pinna"};
        String[] attuale2={"cane","ciao lao","casa","zorro", "Pinna"};
         //Array posizione 2 negativa
       //Array posizione 1 maggiore del numero di elementi
        int pos1=5;
        int pos2=1;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2);
    }
    
     @Test
    public void testScambiaArrayStringPos2Maggiore() 
    {  
        String[] atteso2={"cane","ciao lao","casa","zorro", "Pinna"};
        String[] attuale2={"cane","ciao lao","casa","zorro", "Pinna"};
        
         //Array posizione 2 maggiore del numero di elementi
        int pos1=1;
        int pos2=5;
        Ordinatore.scambia(attuale2, pos1, pos2);
        assertArrayEquals(attuale2,atteso2);
    }
    
    
    
    /**
     * Test of scambia method for array of String, of class Ordinatore.
     */
    @Test
    public void testScambiaArrayStringCorretto()
    {

        String[] atteso3={"Pinna","ciao lao","casa","zorro", "cane"};
        String[] attuale3={"cane","ciao lao","casa","zorro", "Pinna"};
        int pos1=0;
        int pos2=4;
        Ordinatore.scambia(attuale3, pos1, pos2);
        assertArrayEquals(attuale3,atteso3);
    }

     @Test
    public void testSelectionSortCrescenteIntVuoto()
    {
  //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
    }
    
    @Test
    public void testSelectionSortCrescenteIntNull()
    {
        //Array= null
        int[] atteso=null;
        int []attuale=null;
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
    }
    
     @Test
    public void testSelectionSortCrescenteIntUnSoloElemento()
    {
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.selectionSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2);
    }
    @Test
    public void testSelectionSortCrescenteIntElementiRipetuti()
    {
        //array con vari elementi che si ripetono
        int[] atteso3={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale3={10,10,0,-2,4,-2,1, 19,-5,-5,88,9,88,-2,-2 };
        attuale3=Ordinatore.selectionSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3);
    }
    
    @Test
    public void testSelectionSortCrescenteIntOrdinatoDecrescente()
    { 
        //array iniziale ordinato decrescente
        int[] atteso4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        attuale4=Ordinatore.selectionSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
    }
    
     @Test
    public void testSelectionSortCrescenteIntOrdinatoCrescente()
    { 
         //array iniziale già ordinato crescente
        int[] atteso5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        int[] attuale5={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale5=Ordinatore.selectionSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5);
    }
   
    public void testSelectionSortIntDecrescenteIntVuoto()
    { 
       //array vuoto
        int[] atteso={};
        int[] attuale={};
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
    }

    public void testSelectionSortIntDecrescenteIntNull()
    { 
        //Array= null
        int[] atteso=null;
        int[] attuale=null;
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
    }
    
     public void testSelectionSortIntDecrescenteUnSoloElemento()
    { 
        //array con un solo elemento
        int[] atteso2={10};
        int[] attuale2={10};
        attuale2=Ordinatore.selectionSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={10}");
    }
     
    public void testSelectionSortIntDecrescenteElementiRipetuti()
    { 
           //array con vari elementi che si ripetono
        int[] atteso3={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale3={10,10,0,-2,4,-2,1, 19,-5,-5,88,9,88,-2,-2 };
        attuale3=Ordinatore.selectionSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3);
    }
    
    public void testSelectionSortIntDecrescenteOrdinatoCrescente()
    { 
       //array iniziale ordinato crescente
        int[] atteso4={88,88,19,10, 10,9,4,1,0,-2,-2,-2, -2,-5,-5};
        int[] attuale4={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88};
        attuale4=Ordinatore.selectionSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4);
    }
    
    public void testSelectionSortIntDecrescenteOrdinatoDecrescente()
    { 
       //array iniziale già ordinato decrescente
        int[] atteso5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        int[] attuale5={88,88,19,10, 10,9,4,1,0,-2,-2,-2,-2,-5,-5};
        attuale5=Ordinatore.selectionSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5,"Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
    }
    
    public void testSelectionSortCrescenteStringVuoto()
    { 
        //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");
    }
    
    public void testSelectionSortCrescenteStringNull()
    { 
         
        //Array= null
        String[] atteso=null;
        String[] attuale=null;
        attuale=Ordinatore.selectionSortCrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null");
    }
    
    public void testSelectionSortCrescenteStringUnSoloElemento()
    { 
         //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.selectionSortCrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
    }
    
     
    public void testSelectionSortCrescenteStringElementiCheSiRipetono()
    { 
         //array con vari elementi che si ripetono
        String[] atteso3={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.selectionSortCrescente(attuale3);
        assertArrayEquals(atteso3,attuale3); 
    }
    
    public void testSelectionSortCrescenteStringOrdinatoDecrescente()
    { 
         //array iniziale ordinato decrescente
        String[] atteso4={"","baffo","cane","cane", "casa","ciao lao","ciao lao","Pinna","pinna","Pinna","zorro","zorro"};
        String[] attuale4={"zorro","zorro","Pinna","Pinna", "pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.selectionSortCrescente(attuale4);
        assertArrayEquals(atteso4,attuale4);  
    }
    
    public void testSelectionSortCrescenteStringOrdinatoCrescente()
    { 
            //array iniziale già ordinato crescente
        String[] atteso5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.selectionSortCrescente(attuale5);
        assertArrayEquals(atteso5,attuale5);   
    }
    
    public void testSelectionSortDecrescenteStringVuoto()
    { 
             //array vuoto
        String[] atteso={};
        String[] attuale={};
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array vuoto");  
    }
    
    public void testSelectionSortDecrescenteStringNull()
    { 
         //Array= null
        String[] atteso=null;
        String[] attuale=null;
        attuale=Ordinatore.selectionSortDecrescente(attuale);
        assertArrayEquals(atteso,attuale,"Array null"); 
    }

    public void testSelectionSortDecrescenteStringUnSoloElemento()
    { 
       //array con un solo elemento
        String[] atteso2={"cane"};
        String[] attuale2={"cane"};
        attuale2=Ordinatore.selectionSortDecrescente(attuale2);
        assertArrayEquals(atteso2,attuale2,"Array={cane)}");
    }
    
    public void testSelectionSortDecrescenteStringElementiCheSiRipetono()
    {   
        //array con vari elementi che si ripetono
        String[] atteso3={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale3={"cane", "ciao lao","", "cane", "casa","zorro", "Pinna","zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3=Ordinatore.selectionSortDecrescente(attuale3);
        assertArrayEquals(atteso3,attuale3);   
    }
    
    public void testSelectionSortDecrescenteStringOrdinatoCrescente()
    {   
        
         //array iniziale  ordinato crescente
        String[] atteso5={"zorro","zorro","Pinna","pinna","Pinna","ciao lao","ciao lao","casa","cane","cane","baffo",""};
        String[] attuale5={"","baffo","cane","cane", "casa","ciao lao","ciao lao","pinna","Pinna","Pinna","zorro","zorro"};
        attuale5=Ordinatore.selectionSortDecrescente(attuale5);
        assertArrayEquals(atteso5,attuale5);   
    
    }
    /**
     * Test of selectionSortDecrescente of String method, of class Ordinatore.
     */
    @Test
    public void testSelectionSortDecrescenteStringOrdinatoDecrescente() 
    {

         //array iniziale ordinato decrescente
        String[] atteso4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        String[] attuale4={"zorro","zorro","Pinna","pinna", "Pinna","ciao lao","ciao lao", "casa","cane","cane","baffo",""};
        attuale4=Ordinatore.selectionSortDecrescente(attuale4);
        assertArrayEquals(atteso4,attuale4);
    
    }

    
    
    //Bubblòe sort
   


    @Test
    public void testBubbleSortCrescenteIntVuoto() {
        int[] atteso = {};
        int[] attuale = {};
        attuale = Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array vuoto");
    }

    @Test
    public void testBubbleSortCrescenteIntNull() {
        int[] atteso = null;
        int[] attuale = null;
        attuale = Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array null");
    }

    @Test
    public void testBubbleSortCrescenteIntUnSoloElemento() {
        int[] atteso2 = {10};
        int[] attuale2 = {10};
        attuale2 = Ordinatore.bubbleSortCrescente(attuale2);
        assertArrayEquals(atteso2, attuale2);
    }

    @Test
    public void testBubbleSortCrescenteIntElementiRipetuti() {
        int[] atteso3 = {-5, -5, -2, -2, -2, -2, 0, 1, 4, 9, 10, 10, 19, 88, 88};
        int[] attuale3 = {10, 10, 0, -2, 4, -2, 1, 19, -5, -5, 88, 9, 88, -2, -2};
        attuale3 = Ordinatore.bubbleSortCrescente(attuale3);
        assertArrayEquals(atteso3, attuale3);
    }

    @Test
    public void testBubbleSortCrescenteIntOrdinatoDecrescente() {
        int[] atteso4 = {-5, -5, -2, -2, -2, -2, 0, 1, 4, 9, 10, 10, 19, 88, 88};
        int[] attuale4 = {88, 88, 19, 10, 10, 9, 4, 1, 0, -2, -2, -2, -2, -5, -5};
        attuale4 = Ordinatore.bubbleSortCrescente(attuale4);
        assertArrayEquals(atteso4, attuale4, "Array={-5,-5,-2,-2,-2,-2, 0,1,4,9,10,10, 19,88,88}");
    }

    @Test
    public void testBubbleSortCrescenteIntOrdinatoCrescente() {
        int[] atteso5 = {-5, -5, -2, -2, -2, -2, 0, 1, 4, 9, 10, 10, 19, 88, 88};
        int[] attuale5 = {-5, -5, -2, -2, -2, -2, 0, 1, 4, 9, 10, 10, 19, 88, 88};
        attuale5 = Ordinatore.bubbleSortCrescente(attuale5);
        assertArrayEquals(atteso5, attuale5);
    }

     @Test
    public void testBubbleSortCrescenteStringVuoto() {
        String[] atteso = {};
        String[] attuale = {};
        attuale = Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array vuoto");
    }

    @Test
    public void testBubbleSortCrescenteStringNull() {
        String[] atteso = null;
        String[] attuale = null;
        attuale = Ordinatore.bubbleSortCrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array null");
    }

    @Test
    public void testBubbleSortCrescenteStringUnSoloElemento() {
        String[] atteso2 = {"cane"};
        String[] attuale2 = {"cane"};
        attuale2 = Ordinatore.bubbleSortCrescente(attuale2);
        assertArrayEquals(atteso2, attuale2, "Array={cane)}");
    }

    @Test
    public void testBubbleSortCrescenteStringElementiCheSiRipetono() {
        String[] atteso3 = {"", "baffo", "cane", "cane", "casa", "ciao lao", "ciao lao", "Pinna", "pinna", "Pinna", "zorro", "zorro"};
        String[] attuale3 = {"cane", "ciao lao", "", "cane", "casa", "zorro", "Pinna", "zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3 = Ordinatore.bubbleSortCrescente(attuale3);
        assertArrayEquals(atteso3, attuale3);
    }

    @Test
    public void testBubbleSortCrescenteStringOrdinatoDecrescente() {
        String[] atteso4 = {"", "baffo", "cane", "cane", "casa", "ciao lao", "ciao lao", "Pinna", "Pinna", "pinna", "zorro", "zorro"};
        String[] attuale4 = {"zorro", "zorro", "Pinna", "Pinna", "pinna", "ciao lao", "ciao lao", "casa", "cane", "cane", "baffo", ""};
        attuale4 = Ordinatore.bubbleSortCrescente(attuale4);
        assertArrayEquals(atteso4, attuale4);
    }

    @Test
    public void testBubbleSortCrescenteStringOrdinatoCrescente() {
        String[] atteso5 = {"", "baffo", "cane", "cane", "casa", "ciao lao", "ciao lao", "pinna", "Pinna", "Pinna", "zorro", "zorro"};
        String[] attuale5 = {"", "baffo", "cane", "cane", "casa", "ciao lao", "ciao lao", "pinna", "Pinna", "Pinna", "zorro", "zorro"};
        attuale5 = Ordinatore.bubbleSortCrescente(attuale5);
        assertArrayEquals(atteso5, attuale5);
    }
    
    
     @Test
    public void testBubbleSortDecrescenteIntVuoto() {
        int[] atteso = {};
        int[] attuale = {};
        attuale = Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array vuoto");
    }

    @Test
    public void testBubbleSortDecrescenteIntNull() {
        int[] atteso = null;
        int[] attuale = null;
        attuale = Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array null");
    }

    @Test
    public void testBubbleSortDecrescenteIntUnSoloElemento() {
        int[] atteso2 = {10};
        int[] attuale2 = {10};
        attuale2 = Ordinatore.bubbleSortDecrescente(attuale2);
        assertArrayEquals(atteso2, attuale2);
    }

    @Test
    public void testBubbleSortDecrescenteIntElementiRipetuti() {
        int[] atteso3 = {88, 88, 19, 10, 10, 9, 4, 1, 0, -2, -2, -2, -2, -5, -5};
        int[] attuale3 = {10, 10, 0, -2, 4, -2, 1, 19, -5, -5, 88, 9, 88, -2, -2};
        attuale3 = Ordinatore.bubbleSortDecrescente(attuale3);
        assertArrayEquals(atteso3, attuale3);
    }

    @Test
    public void testBubbleSortDecrescenteIntOrdinatoCrescente() {
        int[] atteso4 = {88, 88, 19, 10, 10, 9, 4, 1, 0, -2, -2, -2, -2, -5, -5};
        int[] attuale4 = {-5, -5, -2, -2, -2, -2, 0, 1, 4, 9, 10, 10, 19, 88, 88};
        attuale4 = Ordinatore.bubbleSortDecrescente(attuale4);
        assertArrayEquals(atteso4, attuale4);
    }

    @Test
    public void testBubbleSortDecrescenteIntOrdinatoDecrescente() {
        int[] atteso5 = {88, 88, 19, 10, 10, 9, 4, 1, 0, -2, -2, -2, -2, -5, -5};
        int[] attuale5 = {88, 88, 19, 10, 10, 9, 4, 1, 0, -2, -2, -2, -2, -5, -5};
        attuale5 = Ordinatore.bubbleSortDecrescente(attuale5);
        assertArrayEquals(atteso5, attuale5);
    }

    @Test
    public void testBubbleSortDecrescenteStringVuoto() {
        String[] atteso = {};
        String[] attuale = {};
        attuale = Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array vuoto");
    }

    @Test
    public void testBubbleSortDecrescenteStringNull() {
        String[] atteso = null;
        String[] attuale = null;
        attuale = Ordinatore.bubbleSortDecrescente(attuale);
        assertArrayEquals(atteso, attuale, "Array null");
    }

    @Test
    public void testBubbleSortDecrescenteStringUnSoloElemento() {
        String[] atteso2 = {"cane"};
        String[] attuale2 = {"cane"};
        attuale2 = Ordinatore.bubbleSortDecrescente(attuale2);
        assertArrayEquals(atteso2, attuale2, "Array={cane)}");
    }

    @Test
    public void testBubbleSortDecrescenteStringElementiCheSiRipetono() {
        String[] atteso3 = {"zorro", "zorro", "Pinna", "pinna", "Pinna", "ciao lao", "ciao lao", "casa", "cane", "cane", "baffo", ""};
        String[] attuale3 = {"cane", "ciao lao", "", "cane", "casa", "zorro", "Pinna", "zorro", "baffo", "pinna", "ciao lao", "Pinna"};
        attuale3 = Ordinatore.bubbleSortDecrescente(attuale3);
        assertArrayEquals(atteso3, attuale3);
    }

    @Test
    public void testBubbleSortDecrescenteStringOrdinatoCrescente() {
        String[] atteso5 = {"zorro", "zorro", "pinna", "Pinna", "Pinna", "ciao lao", "ciao lao", "casa", "cane", "cane", "baffo", ""};
        String[] attuale5 = {"", "baffo", "cane", "cane", "casa", "ciao lao", "ciao lao", "pinna", "Pinna", "Pinna", "zorro", "zorro"};
        attuale5 = Ordinatore.bubbleSortDecrescente(attuale5);
        assertArrayEquals(atteso5, attuale5);
    }
    
    
    @Test
public void testBubbleSortDecrescenteStringOrdinatoDecrescente() {
    String[] atteso4 = {"zorro", "zorro", "Pinna", "pinna", "Pinna", "ciao lao", "ciao lao", "casa", "cane", "cane", "baffo", ""};
    String[] attuale4 = {"zorro", "zorro", "Pinna", "pinna", "Pinna", "ciao lao", "ciao lao", "casa", "cane", "cane", "baffo", ""};
    attuale4 = Ordinatore.bubbleSortDecrescente(attuale4);
    assertArrayEquals(atteso4, attuale4);
}
    
    
}
