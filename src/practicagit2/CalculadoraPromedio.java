package practicagit2;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class CalculadoraPromedio {
    
    /**
     *Programa que calcula el promedio de las 10 notas introducidas por el usuario
     *
     * @param args
     */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sumaNotas = 0;
        System.out.println("Introduce 10 notas:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la nota " + i + ": ");
            double nota = teclado.nextDouble();
            sumaNotas += nota;
        }
        double promedio = sumaNotas / 10;
        System.out.println("El promedio es: " + promedio);
    }
}
