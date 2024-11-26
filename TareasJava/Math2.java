/*2. Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a,
 b, c), según la siguiente fórmula:
 Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
 donde p = (a+b+c)/2
 Para calcular la raíz cuadrada se utiliza el método Math.sqrt()*/

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserte la longitud del primer lado: ");
        Double a = sc.nextDouble();
        System.out.println("Inserte la longitud del primer lado: ");
        Double b = sc.nextDouble();
        System.out.println("Inserte la longitud del primer lado: ");
        Double c = sc.nextDouble();
        Double area;
        double p = (a+b+c)/2;
        double z = p*(p-a)*(p-b)*(p-c);
        area = Math.sqrt(z);
        System.out.println("El área es: "+ area);
        sc.close();
    }
}
