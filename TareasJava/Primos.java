import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        int div=2;
        System.out.println("Ingrese un número diferente a 0");
        Scanner dato=new Scanner(System.in);
        int numero=dato.nextInt();

        if (numero!=0) {
            if (numero==1) {
                System.out.println("El número "+numero+" no es primo.");
            } else {while (numero % div!=0) {
                div++;
            }if (div==numero) {System.out.println("El número "+numero+" es primo.");
                
            } else {System.out.println("El número "+ numero+ " no es primo.");
                
            }
                
            }
        }else{System.out.println("Has perdido.");}

    }
}
