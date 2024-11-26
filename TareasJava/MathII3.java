/*3.Diseñar un programa que pide dos números por pantalla, y se deben generar los números
aleatorios entre ellos.
 */

import java.util.Random;
import java.util.Scanner;

public class MathII3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorios = new Random();
        System.out.println("Ingrese el primer número: ");
        int uno = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int dos = sc.nextInt();
        for (int i = uno; i <= dos; i++) {
            System.out.println((int) (Math.random() * (dos - uno + 1) + uno));
        }
        sc.close();
    }
}
