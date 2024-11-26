//13. Pedir un número y calcular su factorial.

import java.util.Scanner;

public class Tareja4if13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero= sc.nextInt();
        int i;
        int fact =numero;
        for(i=0; i<numero; i++) {
                fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
