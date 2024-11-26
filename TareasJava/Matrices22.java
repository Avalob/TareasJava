/*2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
originales y el resultado.*/

import java.util.Scanner;

public class Matrices22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de las matrices:");
        int longitud = sc.nextInt();
        int[][] matriz1 =new int[longitud][longitud];
        int [][] matriz2 = new int[longitud][longitud];
        int [][] suma= new int [longitud][longitud];
        System.out.println("Ingrese los valores de la primera matriz:");
        for (int f=0; f<matriz1.length; f++) {
            for (int c=0; c<matriz1[f].length; c++){
                System.out.print("Ingrese el valor para la primera matriz para la posición [" + f + "][" + c + "]: ");
                matriz1[f][c] = sc.nextInt();
            }
        }
        for (int f=0; f<matriz2.length; f++) {
            for (int c=0; c<matriz2[f].length; c++){
                System.out.print("Ingrese el valor para la segunda matriz para la posición [" + f + "][" + c + "]: ");
                matriz2[f][c] = sc.nextInt();
            }
        }
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                suma[f][c] = matriz1[f][c] + matriz2[f][c];
            }
        }
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[f].length; c++) {
                System.out.print("|"+suma[f][c] + "|");
            }
        }

    }
    }

