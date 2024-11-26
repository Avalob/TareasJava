import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número.");
        Scanner dato= new Scanner(System.in);
        int numero= dato.nextInt();
        if (numero%2==0) {
            System.out.println("El número "+ numero+ " es par.");
        } else {System.out.println("El número "+ numero+ " es impar.");
            
        }
    }
}
