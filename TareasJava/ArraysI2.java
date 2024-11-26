/*2.Se pide por pantalla el número de posiciones que queremos que tenga nuestro array, se
piden los datos por pantalla.
Se crea otro array, pidiendo el número de posiciones por pantalla. Los valores se cargan con un
bucle for.
Crear un tercer array que contiene, los datos de los dos arrays*/

import java.util.Scanner;

public class ArraysI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número de posiciones en el primer array: ");
        int posiciones1 = sc.nextInt();
        int[] array1 = new int[posiciones1];
        for (int i = 0; i < posiciones1; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        System.out.print("Ingrese el número de posiciones para el segundo array: ");
        int posiciones2 = sc.nextInt();
        int[] array2 = new int[posiciones2];

        for ( i = 0; i < posiciones2; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[posiciones1 + posiciones2];

        for ( i = 0; i < posiciones1; i++) {
            array3[i] = array1[i];
        }

        for (i = 0; i < posiciones2; i++) {
            array3[posiciones1 + i] = array2[i];
        }

        System.out.println("El tercer array: ");
        for ( i = 0; i < array3.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + array3[i]);
    }
}}}
