import java.util.Scanner;

public class Euroconversor {
    public static void main(String[] args) {
    String texto= "Ingrese la cantidad en euros";
    System.out.println(texto);
        Scanner datos = new Scanner (System.in);
        double numeroEuro = datos.nextDouble();
        double numeroLibra = 0;
        numeroLibra= numeroEuro*0.86;
        System.out.println("La cantidad en libras es: " + numeroLibra);

    }
}
