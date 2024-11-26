//5. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

import java.util.Scanner;

public class Tarea4if5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int numero=sc.nextInt();
        if (numero<5 && numero>=0) {
            System.out.println("Insuficiente");
        } else {if (numero==5) {
            System.out.println("Suficiente");
        } else {if (numero>5 && numero<7) {
            System.out.println("Bien");
        } else {if (numero >=7 && numero<9) {
            System.out.println("Notable");
        } else {if (numero>=9 && numero<=10) {
            System.out.println("Sobresaliente");
        } else {System.out.println("Ingrese una nota válida.");
            
        }
            
        }
            
        }
            
        }
            
        }
    }
}
