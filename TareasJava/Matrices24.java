/*4.Generar una matriz de 3×3 con números aleatorios sin repetirse.*/
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Matrices24 {
    public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria(3, 3);
        
        /*------------------ */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        if (filas * columnas > 9) {
            throw new IllegalArgumentException("La matriz no puede tener más de 9 elementos únicos.");
        }
        
        int[][] matriz = new int[filas][columnas];
        Set<Integer> numerosUtilizados = new HashSet<>();
        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeroAleatorio;
                do {
                    numeroAleatorio = random.nextInt(9) + 1; // Generar un número aleatorio entre 1 y 9
                } while (numerosUtilizados.contains(numeroAleatorio)); // Verificar si el número ya ha sido utilizado
                
                matriz[i][j] = numeroAleatorio;
                numerosUtilizados.add(numeroAleatorio);
            }
        }
        
        return matriz;
    }
}