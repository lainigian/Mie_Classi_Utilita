/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._mie_classi_utilita;



/**
 *
 * @author gian
 */
public class Ordinatore 
{
        /**
         * Sacmabia due elementi in un array di interi
         * @param array
         * @param pos1
         * @param pos2 
         */
        public static void scambia (int[] array, int pos1, int pos2)
        {
            int s;
            if (array==null)
                return;
            if(pos1<0 || pos2<0 ||pos1>=array.length || pos2>=array.length)
                return;
            if (array.length!=0)
            {
                s=array[pos1];
                array[pos1]=array[pos2];
                array[pos2]=s;
            }
        }
        
        /**
         * Sacmabia due eleementi di un array di stringhe
         * @param array
         * @param pos1
         * @param pos2 
         */
        public static void scambia (String[] array, int pos1, int pos2)
        {
            String s;
            if (array==null)
                return;
            if(pos1<0 || pos2<0 ||pos1>=array.length || pos2>=array.length)
                return;
            if (array.length!=0)
            {
                s=array[pos1];
                array[pos1]=array[pos2];
                array[pos2]=s;
            }
            
            
            
        }

        /**
         * Ordinamento crescente con selection sort di un array di interi
         * @param a
         * @return 
         */
        public static int[] selectionSortCrescente(int[] a)
        {
            if (a==null)
                return null;
            int N=a.length;
            int[] ordinato=new int[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            
            for (int i=0;i<N-1;i++)
            {
                for (int j=i;j<N;j++)
                {
                    if (ordinato[j]<ordinato[i])
                        scambia(ordinato, i, j);
                }
            }
            return ordinato;
        }
        
        /**
         * Ordinamento decrescente con selection sort di un array di interi
         * @param a
         * @return 
         */
        public static int[] selectionSortDecrescente(int[] a)
        {
            if (a==null)
                return null;
            int N=a.length;
            int[] ordinato=new int[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            
            for (int i=0;i<N-1;i++)
            {
                for (int j=i;j<N;j++)
                {
                    if (ordinato[j]>ordinato[i])
                        scambia(ordinato, i, j);
                }
            }
            return ordinato;
        }
        
        /**
         * Ordinamento crescente con selection sort di un array di stringhe
         * @param a
         * @return 
         */
        public static String[] selectionSortCrescente(String[] a)
        {
            if (a==null)
                return null;
            int N=a.length;
            String[] ordinato=new String[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            
            for (int i=0;i<N-1;i++)
            {
                for (int j=i;j<N;j++)
                {
                    if (ordinato[j].compareToIgnoreCase(ordinato[i])<0)
                        scambia(ordinato, i, j);
                }
            }
            return ordinato;
        }
        
        /**
         * Ordinamento decrescente con selection sort di un array di stringhe
         * @param a
         * @return 
         */
        public static String[] selectionSortDecrescente(String[] a)
        {
            if (a==null)
                return null;
            int N=a.length;
            String[] ordinato=new String[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            
            for (int i=0;i<N-1;i++)
            {
                for (int j=i;j<N;j++)
                {
                    if (ordinato[j].compareToIgnoreCase(ordinato[i])>0)
                        scambia(ordinato, i, j);
                }
            }
            return ordinato;
        }
        
        //BUBBLE SORT
        /**
         * Ordinamento crescente con bubble sort di un array di interi
         * @param a l'array ordinato
         * @return 
         */
        public static int[] bubbleSortCrescente(int[] a)
        {
            if (a==null)
                return null;
            boolean scambioAvvenuto;
            int N=a.length;
            int[] ordinato=new int[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            //Bubble sort
            do 
            {
                scambioAvvenuto=false;
                
                for(int i=0;i<N-1;i++)
                {
                    if (ordinato[i]>ordinato[i+1])
                    {
                        scambia(ordinato, i, i+1);
                        scambioAvvenuto=true;
                    }
                }
            }while (scambioAvvenuto);
           return ordinato; 
        } 
        
        /**
         * Ordinamento decrescente con bubble sort di un array di interi
         * @param a l'array ordinato
         * @return 
         */
        public static int[] bubbleSortDecrescente(int[] a)
        {
            if (a==null)
                return null;
            boolean scambioAvvenuto;
            int N=a.length;
            int[] ordinato=new int[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            //Bubble sort
            do 
            {
                scambioAvvenuto=false;
                
                for(int i=0;i<N-1;i++)
                {
                    if (ordinato[i]<ordinato[i+1])
                    {
                        scambia(ordinato, i, i+1);
                        scambioAvvenuto=true;
                    }
                }
            }while (scambioAvvenuto);
           return ordinato; 
        } 
       
    /**
         * Ordinamento crescente con bubble sort di un array di stringhe
         * @param a l'array ordinato
         * @return 
         */
        public static String[] bubbleSortCrescente(String[] a)
        {
            if (a==null)
                return null;
            boolean scambioAvvenuto;
            int N=a.length;
            String[] ordinato=new String[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            //Bubble sort
            do 
            {
                scambioAvvenuto=false;
                
                for(int i=0;i<N-1;i++)
                {
                    if (ordinato[i].compareToIgnoreCase(ordinato[i+1])>0)
                    {
                        scambia(ordinato, i, i+1);
                        scambioAvvenuto=true;
                    }
                }
            }while (scambioAvvenuto);
           return ordinato; 
        } 
        
        
        /**
         * Ordinamento decrescente con bubble sort di un array di stringhe
         * @param a l'array ordinato
         * @return 
         */
        public static String[] bubbleSortDecrescente(String[] a)
        {
            if (a==null)
                return null;
            boolean scambioAvvenuto;
            int N=a.length;
            String[] ordinato=new String[N];
            //copio i valori di a nel nuovo vettore
            for (int i=0;i<N;i++)
            {
                ordinato[i]=a[i];
            }
            //Bubble sort
            do 
            {
                scambioAvvenuto=false;
                
                for(int i=0;i<N-1;i++)
                {
                    if (ordinato[i].compareToIgnoreCase(ordinato[i+1])<0)
                    {
                        scambia(ordinato, i, i+1);
                        scambioAvvenuto=true;
                    }
                }
            }while (scambioAvvenuto);
           return ordinato; 
        } 
        
    
  
}       

