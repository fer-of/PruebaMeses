/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebameses;

/**
 * Esta interfaz proporciona constantes para representar los meses del año y 
 * un arreglo de cadenas que contiene los nombres de los meses
 * Las constantes numéricas comienzan desde 1 para enero hasta 12 para diciembre
 * Los nombres de los meses se almacenan en un arreglo donde el índice 0 está vacío 
 * y los índices de 1 a 12 contienen los nombres de los meses
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public interface Meses {
    int UNO =1, DOS=2, TRES =3, CUATRO = 4, CINCO =5, SEIS = 6;
    int SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;
    /** 
     * Arreglo que contiene los nombres de los meses
     */
    String [] NOMBRE_MESES = {"", "Enero", "Febrero", "Marzo",
           "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
            "Noviembre", "Diciembre"};
   
}
