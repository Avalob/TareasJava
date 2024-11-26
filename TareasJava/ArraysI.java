/*5.Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se piden por
pantalla. Se debe calcular su nota media final.
 Si la media>=5, la calificación es aprobado
 Si la media<5, la calificación es suspenso
 Si la media>5 y <=6.5 la calificación es bien
 Si la media >6.5 y <=8.5 la calificación es notable
 Si la media >8.5 y >=9 la calificación es sobresaliente*/

import java.util.Scanner;

public class ArraysI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double []listaNotas = new double[6];
        for (int i=0; i<listaNotas.length; i++){
            System.out.println("Ingrese una nota:");
            double nota = sc.nextDouble();
            listaNotas [ i ]= nota;
        }
        double sumaNotas=0;
        for(int i=0; i<listaNotas.length;i++){
            double nota = listaNotas[i];
            sumaNotas =sumaNotas +nota;
        }
        double media = sumaNotas/6;
        if (media<5) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Aprobado");
        } 
            
        if (media>5 && media<=6.5) {
            System.out.println("Bien");
        }else {if (media>6.5 && media<=8.5) {
            System.out.println("Notable");
        } else {if (media>8.5) {
            System.out.println("Sobresaliente");
        }
            
        }
            
        }
            
        }
        }
        

