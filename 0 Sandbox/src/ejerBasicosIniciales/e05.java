package ejerBasicosIniciales;

/* 5. Programa Java que declare una variable A de tipo entero y as�gnale un valor.
 * A continuaci�n muestra un mensaje indicando si A es par o impar.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
 */

public class e05 {
	
	public static Integer A = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(A + (A%2==0 ? " es par " : " es impar "));

	}

}
