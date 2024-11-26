/*Cargar un String por teclado e implementar los siguientes métodos:
a) Imprimir la primera mitad de los caracteres de la cadena.
b) Imprimir el último carácter.
c) Imprimirlo en forma inversa.
d) Imprimir cada carácter del String separado con un guión.
e) Imprimir la cantidad de vocales almacenadas.
f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto
como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)  */

import java.util.Scanner;

public class TareaStringIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = sc.nextLine();
        int numero_palabra = palabra.length();
        int mitad_palabra = numero_palabra / 2;
        System.out.println(palabra.substring(0, mitad_palabra));
        System.out.println(palabra.charAt(numero_palabra - 1));
        StringBuilder inversa = new StringBuilder(palabra).reverse();
        System.out.println(inversa);
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
            if (i < caracteres.length - 1) {
                System.out.print("-");
            }
        }
        int contador = 0;
        for (int x = 0; x < palabra.length(); x++) {
            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'i')
                    || (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'u')) {
                contador++;

            }
        }
        System.out.println("\nvocales: " + contador);
        if (inversa.equals(palabra) == true) {
            System.out.println("Palíndromo.");
        } else {
            System.out.println("No palíndromo.");
        }
    }
}
