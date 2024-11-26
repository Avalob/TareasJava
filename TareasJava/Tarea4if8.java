//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
//pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto
//a N. El proceso termina cuando el usuario acierta

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tarea4if8 {
    public static void main(String[] args) {
        int numerocorrecto=ThreadLocalRandom.current().nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = sc.nextInt();
        do {if (numero>numerocorrecto) {
            System.out.println("El número correcto es menor.");
            numero = sc.nextInt();
        } else {System.out.println("El número correcto es mayor.");
            numero = sc.nextInt();
        }
            
        } while (numero!=numerocorrecto);
        System.out.println("Acertaste!");
    }
}
