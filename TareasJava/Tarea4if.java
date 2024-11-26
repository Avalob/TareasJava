//1. Pedir un número e indicar si es positivo o negativo .
import java.util.Scanner;
public class Tarea4if {

    public static void main(String[] args) {
        System.out.println("Ingrese un número:");
        Scanner dato= new Scanner(System.in);
        double numero = dato.nextDouble();
        if (numero >= 0) {
            System.out.println("El número "+numero+" es positivo");
        } else {
            System.out.println("El número "+numero+" es negativo");
        }
        

    }
}