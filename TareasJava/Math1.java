
/*1.Programa que tome como dato de entrada un número que corresponde a la longitud del radio
una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
La fórmula para calcular el volumen de la esfera es
v = (4/3)*PI*r^3
 */

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Ingrese el radio:");
        radio = sc.nextDouble();
        System.out.println("Volumen de la esfera es " + (4.0 / 3) * Math.PI * Math.pow(radio, 3));
        sc.close();
    }
}
