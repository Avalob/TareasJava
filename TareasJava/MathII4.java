/*Diseña la siguiente ecuación:  */

import java.util.Scanner;

public class MathII4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese b: ");
        int b = sc.nextInt();
        System.out.println("Ingrese c: ");
        int c = sc.nextInt();
        double raiz_cuadrada = (Math.pow(b, 2) - (4 * a * c));
        if (raiz_cuadrada >= 0) {
            System.out.println((-b+Math.sqrt(raiz_cuadrada))/(2*a));
            System.out.println((-b-Math.sqrt(raiz_cuadrada))/(2*a));
            }else{
                System.out.println("No tiene solución para numeros reales.");
        }
    }
}