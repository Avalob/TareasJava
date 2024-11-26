/*1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
aleatorios entre 0 y 10.*/
import java.util.Random;
import java.util.Scanner;

public class Matrices21 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int c = sc.nextInt();
        int[][] matriz =new int[5][c];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }
        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
