package practicagit2;

import java.util.Scanner;

/**
 *
 * @author konrad.wachowski
 */
public class CalculadoraIMC {
    
    /**
     * Calculadora para calcular el Indice de Masa Corpotal
     * @param args
     * */
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
         System.out.println("Hola buenas");
        
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = teclado.nextDouble();
        
        System.out.print("Ingresa tu altura en metros: ");
        double altura = teclado.nextDouble();
        
        if (peso > 0 && altura > 0){
            double imc = peso / (altura * altura);
            System.out.println("Tu IMC es: " + imc);
        }else{
            System.out.println("Los valores ingresados no son válidos.");
        }
    }
}
