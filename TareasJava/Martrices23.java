/*. Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos
piden hacer un menú con estas opciones: */

import java.util.Scanner;

public class Martrices23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int f=0; f<matriz.length; f++) {
            for (int c=0; c<matriz[f].length; c++){
                System.out.print("Ingrese el valor para la posición [" + f + "][" + c + "]: ");
                matriz[f][c] = sc.nextInt();
            }
        }
        /*--------------------------------------------------- */
        System.out.println("¿Qué fila quiere sumar?");
        int fila =sc.nextInt();
        int sumafila = 0;
        if (fila>4|| fila<0 ) {
            System.out.println("Esa fila no existe.");
        } else {
            for (int c = 0; c < matriz[fila].length; c++) {
                sumafila += matriz[fila][c];
            }System.out.println("La suma es: " +sumafila); 
    }
    /*----------------------------------------------------- */
    System.out.println("¿Qué columna quiere sumar?");
        int columna =sc.nextInt();
        int sumacolumna=0;
    if (columna>4|| columna<0 ) {
        System.out.println("Esa columna no existe.");
    } else {
        for (int f = 0; f < matriz[columna].length; f++) {
            sumacolumna += matriz[f][columna];
        }
        }
        System.out.println("La suma es: " +sumacolumna);
        /*--------------------------------------------- */
        int sumaDiagonal1 =0;
        for(int f=0; f<4; f++){
            for (int c =0; c<4; c++){
                    if (f ==c) {
                        sumaDiagonal1 += matriz [f][c];
                    }
            }
        }
        System.out.println("La suma  de la diagonal princilpal es: "+sumaDiagonal1);
        /*------------------------------------ */
                int sumaDiagonal2 = 0;
                for (int f = 0; f < 4; f++) {
                    sumaDiagonal2 += matriz[f][3 - f];
                }
                System.out.println("La suma de la diagonal inversa es: " + sumaDiagonal2);
        /*-------------------------------------- */
                int sumaTodos = 0;
                for (int f = 0; f < 4; f++) {
                    for (int c = 0; c < 4; c++) {
                        sumaTodos += matriz[f][c];
                    }
                }
                double media = (double) sumaTodos / (4 * 4);
                System.out.println("La media de todos los valores de la matriz es: " + media);
}
}
