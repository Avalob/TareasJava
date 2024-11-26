//6. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

import java.util.Scanner;

public class Tarea4if6 {
    public static void main(String[] args) {
    System.out.println("Ingrese un número");
    Scanner dato= new Scanner(System.in);
    double numero = dato.nextDouble();
    while (numero!=0) {
        if (numero>0) {
            System.out.println("El número es positivo. Introduzca otro número:");
            numero=dato.nextDouble();
        } else {System.out.println("El número es negativo. Introduzca otro número:");
            numero=dato.nextDouble();
        }
    }
    }
}
