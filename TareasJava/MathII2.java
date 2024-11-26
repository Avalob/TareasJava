/*2.Diseñar un código que pide por pantalla cuantos números aleatorios se desean calcular. Se
deben generar estos números y mostrar los valores por pantalla
 */

import java.util.Scanner;

public class MathII2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuatos números quiere mostrar: ");
        int numero = sc.nextInt();
        for (int i = 0; numero > i; i++) {
            System.out.println(Math.random() * 100);
        }
        sc.close();
    }
}
