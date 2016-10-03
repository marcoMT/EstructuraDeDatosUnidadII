/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Creacion de un buscaminas casero
 * */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class Ejercicio2 {
    private static int minas[][];
    private static int lugares[][];
    
    public static int[][] defineLugares(){
        int[][] mina =     {{0,0,0,0},
                           {0,0,0,0},
                           {0,0,0,0},
                           {0,0,0,0},
                           {0,0,0,0}};
        lugares = mina;
        return mina;
    }
    
        public static int[][] defineMinas(){
        int[][] mina = {{0,0,1,0},
                           {1,0,0,0},
                           {0,0,0,0},
                           {0,1,0,0},
                           {1,0,0,1}};
        minas = mina;
        return mina;
    }
        
    public void mostrarLugares(){
        
        System.out.println("    0  1  2  3");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "   ");
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(lugares[i][j] + "  ");
                
            }
            
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        Ejercicio2 obj = new Ejercicio2();
        obj.defineLugares();
        obj.defineMinas();
        obj.mostrarLugares();
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        System.out.println("Ingresa la fila");
        int fila = leer.nextInt();
        System.out.println("Ingresa la columna");
        int col = leer.nextInt();
        lugares[fila][col] = 2;
        if(minas[fila][col] == 1){
            lugares[fila][col] = 1;
            obj.mostrarLugares();
            System.out.println("Has perdido");
            break;
        }
        else{
            contador++;
            obj.mostrarLugares();
        }
        }
        if(contador == 5){
            System.out.println("Has Ganado El juego ha terminado");
        }
        else{
            System.out.println("El Juego ha terminado");
        }
        
        
        
    }
}
