package ejerBasicosEstructuraSecuencial;
/* 1. Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
 */

import java.util.Scanner;

public class e01 {

	public static Integer N1;
	public static Integer N2;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		 //leer el primer n�mero 
        System.out.println("Introduce un n�mero entero: "); 
        N1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo n�mero
        System.out.println("Introduce otro n�mero entero: "); 
        N2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los n�meros: " + N1 + " y " + N2);
	}

}
