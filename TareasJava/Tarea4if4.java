//4. Pedir tres números y mostrarlos ordenados de mayor a menor.

import java.util.Scanner;

public class Tarea4if4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el primer número");
    int numero1=sc.nextInt();
    System.out.println("Introduzca el segundo número");
    int numero2=sc.nextInt();
    System.out.println("Introduzca el tercer número");
    int numero3=sc.nextInt();
    if (numero1>=numero2 && numero2 >= numero3) {
        System.out.println(numero1+","+ numero2 +"," + numero3);
    } else {if (numero2>=numero1 && numero1>= numero3) {
        System.out.println(numero2+","+ numero1 +"," + numero3);
    } else {if (numero1>=numero3 && numero3>= numero2) {
        System.out.println(numero1+","+ numero3 +"," + numero2);
    } else {if (numero2>=numero3 && numero3>= numero1) {
        System.out.println(numero2+","+ numero3 +"," + numero1);
    } else {if (numero3>=numero2 && numero2>= numero1) {
        System.out.println(numero3+","+ numero2 +"," + numero1);
    } else {System.out.println(numero3+","+ numero1 +"," + numero2);
        
    }
        
    }
        
    }
        
    }
        
    }
}
}
