package ejerBasicosEstructuraSecuencial;

import java.util.Scanner;

/* 3.      Escribe un programa Java que lee un n�mero entero por teclado
 *  y obtiene y muestra por pantalla el doble y el triple de ese n�mero.
 */
public class e03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer N;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un entero: ");
		N= sc.nextInt();
		System.out.println(N*2 + " " + N*3);

	}

}
