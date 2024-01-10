package funcionesTarea;

import java.util.Scanner;

public class ejercicio4 {

	public static int mayor(int num1, int num2) {
		if(num1<num2) {
			return num2;
		}else {
			return num1;
		}
		
	}
	
	public static void main(String[] arg) {
	
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un primer numero: ");
		num1=sc.nextInt();
		
		System.out.print("Introduce un segundo numero: ");
		num2=sc.nextInt();
		
		int mayor = mayor(num1, num2);
		System.out.print("El mayor de los dos numeros es "+mayor);
	}
}
