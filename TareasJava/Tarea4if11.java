//11. Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;

public class Tarea4if11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=1;
        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        while (cont<=numero) {
            System.out.println(cont);
            cont++;
        }

    }
}
