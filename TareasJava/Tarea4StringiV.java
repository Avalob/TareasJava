import java.util.Scanner;

public class Tarea4StringiV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        sc.close();
    }
}
