package funcionesTarea;

import java.util.Scanner;

public class ejercicio2 {

	public static void numComprendidos(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int numero1;  
        int numero2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        numero1=sc.nextInt();
        
        System.out.print("Introduce un numero: ");
        numero2=sc.nextInt();

        numComprendidos(numero1, numero2);
    }
}
