/*3. Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
enteros con valores del 1 al 6.
Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
dos arrays anteriores.*/

public class ArraysI3 {
    public static void main(String[] args) {
        char [] caracteres = {'a', 'e', 'r', 't', 'y', 'u'};  
        for(int i = 0; i < caracteres.length; i++){                                                                                  
            System.out.println(caracteres[i]);                                                                                  
        }
        int[] enteros = new int[6];
        for(int i = 0; i <=5; i++){   
            enteros[i]=i+1;                                                                               
            System.out.println(enteros[i]);                                                                                  
        }
        int longitudCaracteres = caracteres.length;
            int longitudEnteros = enteros.length;
            int sumaLongitudes = longitudCaracteres + longitudEnteros;
            int[] tercerArray = new int[sumaLongitudes];
            for(int i = 0; i < tercerArray.length; i++){  
                tercerArray [i]=i+1;                                                                                
                System.out.println(tercerArray[i]);                                                                                  
            }
    }

}
