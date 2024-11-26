import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println("Inserte un número.");
        Scanner dato= new Scanner(System.in);
        int n = dato.nextInt();
        int f=0;
        int t1=1;
        int t2;

        for(int i=0;i<= n;i++)
        {
            t2=f;
            f=t1+f;
            t1=t2;

            System.out.println(+t1);
        }
    }

}