/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion;

import java.util.Arrays;
/**
 *
 * @author Johann López
 */
public class SelectionSort {
    
    public void sort(int[] array) {
        int n = array.length; // Obtiene la longitud del array
        for (int i = 0; i < n - 1; i++) { // Bucle externo para cada posición en el array
            int minIndex = i; // Suponer que el primer elemento no ordenado es el mínimo
            for (int j = i + 1; j < n; j++) { // Bucle interno para encontrar el elemento más pequeño
                if (array[j] < array[minIndex]) { // Si se encuentra un elemento más pequeño
                    minIndex = j; // Actualizar el índice del mínimo
                }
            }
            // Intercambiar array[minIndex] y array[i]
            int temp = array[minIndex]; // Guardar el valor de array[minIndex] en una variable temporal
            array[minIndex] = array[i]; // Asignar el valor de array[i] a array[minIndex]
            array[i] = temp; // Asignar el valor temporal a array[i]
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SelectionSort sorter = new SelectionSort(); // Crear una instancia de SelectionSort
        int[] array = {5, 3, 8, 4, 2}; // Definir el array a ordenar
        sorter.sort(array); // Llamar al método sort para ordenar el array
        System.out.println(Arrays.toString(array)); // Imprimir el array ordenado
    }

 }
    

