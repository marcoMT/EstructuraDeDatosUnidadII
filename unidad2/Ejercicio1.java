/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Suma de filas y columnas de un arreglo bidimensional
 * */
package unidad2;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class Ejercicio1 {
    private static int [][] numeros;
    
    public static int[][] defineVentas(){
            int[][] ventas={{25,20,20,50,50,30},
                            {20,15,15,90,80,90},
                            {15,10,10,40,30,40}};
            numeros = ventas;
            return ventas;
            }
    

    
    public void mostrarVentas(){
        
        System.out.println("Tanque      Enero   Febrero Marzo   Abril   Mayo    Junio");
        
        for (int i = 0; i < 3; i++) {
            if(i == 0){
            System.out.print("T.Portátil  ");
            }
            else if(i == 1){
                System.out.print("T.Mediano   ");
            }
            else if(i == 2){
                System.out.print("T.Grande    ");
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(numeros[i][j] + "      ");
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void sumarFilas(){
        System.out.println("Produccion por Producto:");
        for (int i = 0; i < 3; i++) {
            int Cantidad = 0;
            if(i == 0){
            System.out.print("T.Portátil  ");
            }
            else if(i == 1){
                System.out.print("T.Mediano   ");
            }
            else if(i == 2){
                System.out.print("T.Grande    ");
            }
            for (int j = 0; j < 6; j++) {
                Cantidad = Cantidad + numeros[i][j];
                
            }
            System.out.println("    " + Cantidad);
            
            
        }
        System.out.println("");
    }
    
    public void sumarColumnas(){
        System.out.println("Produccion por Mes:");
        System.out.println("Enero Febrero Marzo   Abril   Mayo    Junio");
        
        for (int j = 0; j < 6; j++) {
            int Cantidad = 0;
            for (int i = 0; i < 3; i++) {
                Cantidad = Cantidad + numeros[i][j];
                
            }
            System.out.print(Cantidad + "     ");
        }
        
        
    }
    
    public static void main(String[] args) {
        Ejercicio1 obj = new Ejercicio1();
        obj.defineVentas();
        obj.mostrarVentas();
        obj.sumarFilas();
        obj.sumarColumnas();
    }
    
    
}
