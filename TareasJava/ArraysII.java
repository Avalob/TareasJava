/*1. Diseña el siguiente programa:
• Se pide por pantalla el número de celdas de la tabla o Array
• Si hay 10 celdas, cada celda guarda el número correspondiente a su posición.
• Imprimir el array con un bucle for
• Imprimir el array con un bucle while
• Se debe pintar la tabla, con caracteres gráficos -------, o por el contrario: |, simulando una tabla
visualmente.*/

import java.util.Scanner;

public class ArraysII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de celdas: ");
        int numeroCeldas = sc.nextInt();
        int[] tabla = new int[numeroCeldas];
        for (int i=0; i<numeroCeldas; i++){
            System.out.println("Ingrese un número para la celda "+ i);
            int numero = sc.nextInt();
            tabla [ i ]= numero;
        }
        for (int i=0; i<numeroCeldas; i++){
            int x = tabla [i];
            System.out.println("|CeldaF "+ i + "|" + x+ "|");
        }
        int i=0;
        while (i<numeroCeldas) {
            int x = tabla [i];
            i++;
            System.out.println("|CeldaW "+ i + "|" + x+ "|");
        }
    }
}
