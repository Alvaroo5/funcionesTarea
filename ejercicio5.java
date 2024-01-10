package funcionesTarea;

import java.util.Scanner;

public class ejercicio5 {

	public static int mayor(int num1, int num2, int num3) {
		if(num1<num2) {
			if(num2<num3) {
				return num3;
			}else {
				return num2;
			}
		}else {
			if(num1<num3) {
				return num3;
			}else {
				return num1;
			}
		}
	}
	
	public static void main(String[] arg) {
	
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un primer numero: ");
		num1=sc.nextInt();
		
		System.out.print("Introduce un segundo numero: ");
		num2=sc.nextInt();
		
		System.out.print("Introduce un tercer numero: ");
		num3=sc.nextInt();
		
		int mayor = mayor(num1, num2, num3);
		System.out.print("El mayor de los tres numeros es "+mayor);
	}
}
