
//.Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
//Implementar los siguientes métodos:
//• 1 Imprimir la primera mitad de los caracteres de la cadena
//• 2 Imprimir el último carácter
//• 3 Imprimir la cadena de forma inversa
//• 4 Imprimir cada carácter del String separado por un guión
//• 5 Imprimir la cantidad de vocales almacenadas
import java.util.Scanner;

public class TareaString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos o tres palabras");
        String palabras = sc.nextLine();

        int longitud = palabras.length();
        int mitad = longitud / 2;
        System.out.println("1.Primera mitad: " + palabras.substring(0, mitad));

        char ultimoCaracter = palabras.charAt(palabras.length() - 1);
        System.out.println("2.Último: " + ultimoCaracter);

        StringBuilder inversa = new StringBuilder(palabras).reverse();
        System.out.println("3.Inverso: " + inversa);

        int contador = 0;
        for (int x = 0; x < palabras.length(); x++) {
            if ((palabras.charAt(x) == 'a') || (palabras.charAt(x) == 'e') || (palabras.charAt(x) == 'i')
                    || (palabras.charAt(x) == 'o') || (palabras.charAt(x) == 'u')) {
                contador++;
            }
        }
        System.out.println("5.Cantidad de vocales:"+ contador);

        char[] caracteres = palabras.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
            if (i < caracteres.length - 1) {
                System.out.print("-");
            }

        }

    }
}
