package funcionesTarea;

import java.util.Scanner;

public class ejercicio1 {

	public static void eco(int n) {
		int i;
		for (i = 0; i < n; i++) {
            System.out.println("Eco...");
        }	
	}
	
	public static void main(String[] args) {
        int numVeces;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantas veces desea mostrar: ");
        numVeces=sc.nextInt();
        eco(numVeces);
    }
}
