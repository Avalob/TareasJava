//Desarrollar un programa que solicita la contraseña o password. Se debe comprobar:
//• Que la longitud de la cadena no es superior a 25 caracteres.
//• No debe contener caracteres especiales:@,.,$,#,&,/
//• Se debe almacenar la primera letra y la última en mayúsculas

import java.util.Scanner;

public class TareaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseña");
        String contraseña = sc.nextLine();
        if (contraseña.length() ==0 || contraseña.length() > 25){
            System.out.println("No puede tener mas de 25 carácteres.");
            contraseña = sc.nextLine();
        }else{if (contraseña.indexOf('@')!=-1 || contraseña.indexOf('.')!=-1|| contraseña.indexOf('$')!=-1|| contraseña.indexOf('$')!=-1|| contraseña.indexOf('&')!=-1|| contraseña.indexOf('/')!=-1)  {
            System.out.println("No peude usar caracteres especiales");
            contraseña = sc.nextLine();
        } else {
            System.out.println("contraseña válida");
        }}
        System.out.print(contraseña.charAt(0));System.out.println(contraseña. charAt(contraseña. length()-1));
    }
}
