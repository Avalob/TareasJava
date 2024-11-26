//7. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

import java.util.Scanner;

public class Tarea4if7 {
    public static void main(String[] args) {
        System.out.println("Inserte un número:");
        Scanner dato= new Scanner(System.in);
        int numero= dato.nextInt();
        while (numero!=0) {
            if (numero%2==0) {
                System.out.println("El número es par. Introduzca otro número:");
                numero=dato.nextInt();
            } else {System.out.println("El número es impar. Introduzca otro número:");
                numero=dato.nextInt();
            }
        }
    }
}
