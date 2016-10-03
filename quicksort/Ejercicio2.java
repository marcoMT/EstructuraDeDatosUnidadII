/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Ordenamiento de arreglo por medio de Shellsort
 * */
package quicksort;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class Ejercicio2 {
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
    
    public static void ordenaShell(){
        int i = 0;//variable para intercambiar
        int j = 0;//variable intercambiable
        int aux = 0;//variable para guardar dato
        
        int contador = 1;//auxiliar para recorrer el arreglo
        
        while(contador <= arreglo.length/3){ //recorrer arreglo y definir intervalos de 3
            contador = contador*3 +1;
        }
        
        while(contador > 0){ //recorrer arreglo mientras el contador sea 0
            for (j = contador; j < arreglo.length; j++) {
                aux = arreglo[j];
                i = j;
                while(i > contador - 1 && arreglo[(i-contador)] >= aux){ //Compara datos y los cambia
                    arreglo[i] = arreglo[(i-contador)];
                    i -= contador;
                }
                arreglo[i] = aux;
            }
            contador = (contador - 1)/3;
        }
    }
    
    public static void main(String[] args) {
        Ejercicio2 obj = new Ejercicio2();
        System.out.println("Ordenamiento Shellsort");
        obj.defineArreglo();
        obj.mostrarArreglo();
        System.out.println("");
        obj.ordenaShell();
        obj.mostrarArreglo();
    }
}
