import java.util.Scanner;

public class TareaEscaner {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in); // Usa solo un Scanner

        System.out.println("Ingrese su nombre:");
        String nombre = dato.next();

        System.out.println("Ingrese su apellido:");
        String apellido = dato.next();

        System.out.println("Buenos días " + nombre + " " + apellido);

        dato.close(); // Cierra el Scanner una sola vez
    }
}
