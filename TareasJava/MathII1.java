/*1.Se pide por pantalla el radio de un circulo, se calcula su área. Mostrar el resultado aplicando
una función para redondear el valor. */

import java.util.Scanner;

public class MathII1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrrese el radio del círculo: ");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.sqrt(radio);
        System.out.println("El área es: "+ Math.round(area));
        sc.close();
    }
}
