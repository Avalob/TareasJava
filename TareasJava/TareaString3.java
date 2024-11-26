//Diseña un programa que pide un texto por pantalla y se muestra de la siguiente
//manera:

import java.util.Scanner;

public class TareaString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            System.out.println(palabra);
    }
}
    }
