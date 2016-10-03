/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Ordenamiento de arreglo por medio de Quicksort
 * */
package quicksort;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class Ejercicio1 {

    private static int[] arreglo;

    public static int[] defineArreglo() {
        int[] numeros = {10, 80, 50, 95, 70, 5, 95, 17, 87, 65};
        arreglo = numeros;
        return numeros;
    }

    public void mostrarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
    public static void ordenaQuick(int vect[],int izq,int der){
        int i=0,j=0;
        int x=0,aux=0;
        
        i = izq;
        j = der;
        x= vect[(izq+der)/2];//pivote
        do{
            while((vect[i]<x) && (j<=der)){
                i++;
            }
            while((x<vect[j]) && (j>izq)){
                j--;
            }
            if(i<=j){
                aux=vect[i];
                vect[i]=vect[j];
                vect[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(izq<j){
            ordenaQuick(vect, izq, j);
        }
        if(i < der){
            ordenaQuick(vect, i, der);
        }
    }
    
    

    public static void main(String[] args) {
        Ejercicio1 obj = new Ejercicio1();
        System.out.println("Ordenamiento Quicksort");
        obj.defineArreglo();
        obj.mostrarArreglo();
        System.out.println("");
        obj.ordenaQuick(arreglo, 0, arreglo.length-1);
        obj.mostrarArreglo();
    }
}
