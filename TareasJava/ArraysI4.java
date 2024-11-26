/*4.Diseña un array con los números del 1-57, se debe mostrar el número de celdas que
contienen números pares y el número de celdas que contienen números impares*/

public class ArraysI4 {
    public static void main(String[] args) {
    int[] numeros = new int[57];
    int pares=0;
    int impares=0;
    for(int i= 0;i<numeros.length;i++){
        if(i % 2 ==0){
            pares++;
        }
        else{
            impares++;
        }                                                                          
        }
        System.out.println("pares: "+pares+"impares: " +impares);
    }
}
