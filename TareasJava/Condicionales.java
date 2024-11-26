import java.util.Scanner;

public class Condicionales {

   public static void main(String[] args) {
      System.out.println("Ingrese el primer número.");
      Scanner dato = new Scanner(System.in);
      double numero1 = dato.nextDouble();
      System.out.println("Ingrese el segundo número.");
      Scanner dato2 = new Scanner(System.in);
      double numero2 = dato2.nextDouble();
      System.out.println("Ingrese el tercer número.");
      Scanner dato3 = new Scanner(System.in);
      double numero3 = dato3.nextDouble();

      if (numero1 >= numero2 && numero1 >= numero3) {
         System.out.println(numero1 + " es el mayor.");
      } else if (numero2 >= numero1 && numero2 >= numero3) {
         System.out.println(numero2 + " es el mayor.");
      } else {
         System.out.println(numero3 + " es el mayor.");

      }
      if (numero1 <= numero2 && numero1 <= numero3) {
         System.out.println(numero1 + " es el menor.");
      } else if (numero2 <= numero1 && numero2 <= numero3) {
         System.out.println(numero2 + " es el menor.");
      } else {
         System.out.println(numero3 + " es el menor.");
      }
   }
}