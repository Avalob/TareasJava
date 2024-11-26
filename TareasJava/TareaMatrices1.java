/*1. Dada la siguiente matriz, crear un bloque de código que aparezca de la siguiente
forma:
{3 4 5 7 8 }
{0 0 0 0 }
{1 1 1 1}
{6 6 6 -1} */
public class TareaMatrices1 {
    public static void main(String[] args) {
        int[][] numeros =new int[][]{
            {3, 4, 5, 7, 8},
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {6, 6, 6, -1}
        };
    
        for (int f = 0; f < 4; f++) {
            System.out.print("{");
            for (int c = 0; c < numeros[f].length; c++) {
                System.out.print(numeros[f][c]);
                if (c < numeros[f].length - 1) {
                    System.out.print(" ");
                }
    }System.out.println("}");
}int mayor = numeros[0][0];
for (int[] x : numeros) {
    for (int valor : x) {
        if (valor > mayor) {
            mayor = valor;
        }
    }
}System.out.println(mayor+ " es el mayor");
int menor = numeros[0][0];
for (int[] x : numeros) {
    for (int valor : x) {
        if (valor < menor) {
            menor = valor;
        }
    }
}System.out.println(menor+ " es el menor");
for (int c = 0; c < 5; c++) {
    System.out.print( "|"+numeros[0][c] + "|");
}
System.out.println(" ");
for (int c = 0; c < 4; c++) {
    System.out.print( "|"+numeros[3][c] + "|");
}
}}
