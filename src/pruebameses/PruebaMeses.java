/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebameses;

/**
 * Esta clase sirve como una prueba de concepto para demostrar el acceso a las
 * variables definidas en la interfaz Meses
 * Imprime el nombre de un mes basado en su número utilizando las constantes 
 * definidas en la interfaz y el arreglo de nombres de meses
 * 
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public class PruebaMeses  {
    /**
     * Método principal que se ejecuta al iniciar la aplicación
     * Imprime el nombre de un mes basado en su número utilizando las constantes 
     * definidas en la interfaz y el arreglo de nombres de meses
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main (String [] args){
        //Se puede cceder a las variables de la interfaz sin crear instancias
        // Imprimir el nombre del mes correspondiente al número dos
        System.out.println("El mes " + Meses.DOS + " corresponde a: ");
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
    }
}