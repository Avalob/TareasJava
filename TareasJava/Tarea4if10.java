//10. Pedir números hasta que se introduzca uno negativo, y calcular la media de los números
//positivos. El 0 se considera número positivo

import java.util.Scanner;

public class Tarea4if10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        int numero, suma, cont;
        suma=0;
        cont=0;
        media=1;
        System.out.println("Introduce un número");
        numero=sc.nextInt();
        if (numero>=0) {
            cont++;
            suma+=numero;
            media=(double)suma/cont;
        } while (numero>=0) {
            System.out.println("La media es"+ media);
            sc.close();
        }
}
}