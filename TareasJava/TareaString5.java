/*Codifique un programa que pide por pantalla una dirección de e-mail, comprobar si contiene el
carácter de la @ y del . */
import java.util.Scanner;

public class TareaString5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su correo:");
        String correo =sc.nextLine();
        if (correo.contains("@")&&correo.contains(".")){
            System.out.println("Correo válido");
            
        }else{
            System.out.println("Correo inválido.");
        }
        sc.close();}
}
