package practicagit2;

import java.util.Scanner;

/**
 *
 * @author Rubén
 */
public class CalcularIva {
    
    /**
     * Programa que calcula el IVA que introduce el usuario te devuelve la cantidad total sumandole el IVA introducido.
     * @param args
    **/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cantidad en euros: ");
        double cantidad = teclado.nextDouble();
        System.out.print("Introduce el porcentaje de IVA: ");
        double IVA = teclado.nextDouble();
        double iva = (cantidad * IVA) / 100;
        double precioFinal = cantidad+ iva;
        System.out.println("\nResultados:");
        System.out.println("Cantidad: " + cantidad);
        System.out.println(" IVA " + IVA + "%: " + iva);
        System.out.println("Precio final: " + precioFinal);
        
    }
}
