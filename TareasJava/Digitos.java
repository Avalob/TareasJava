
import java.util.Scanner;
public class Digitos {
public static void main(String[] args) {
    int numero,contador=0,suma=0;
    Scanner dato = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    numero =dato.nextInt();
    while(numero!=0){
    numero=numero/10;
    contador++;
    }
    System.out.println("Cantidad de cifras: "+contador);
}
}