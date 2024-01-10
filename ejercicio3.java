package funcionesTarea;

import java.util.Scanner;

public class ejercicio3 {

	public static float calcularAreaCilindro(float radio, float altura) {
        return (float) (2 * 3.14 * radio * (radio + altura));
    }

    public static float calcularVolumenCilindro(float radio, float altura) {
        return (float) (3.14 * (radio * radio) * altura);
    }
    
	public static void main(String[] args) {
		int opcion;
		float radio;
		float altura;
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de la base:");
        radio = scanner.nextFloat();

        System.out.println("Ingrese la altura:");
        altura = scanner.nextFloat();
        
        System.out.println("Ingrese 1 para calcular el área o 2 para calcular el volumen:");
        
        do {
        	
        	opcion = scanner.nextInt();
        	switch(opcion) {
        	case 1:
        		float area = (float) calcularAreaCilindro(radio, altura);
        		System.out.println("El área del cilindro es: " + area);;break;
        	case 2:
        		float volumen = (float) calcularVolumenCilindro(radio, altura);
        		System.out.println("El volumen del cilindro es: " + volumen);break;
            default:
            	System.out.println("Opción no válida.");break;
        	}
        }while(opcion == 1 | opcion == 2);
        
    }
}
