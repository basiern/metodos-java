 /**
     * Métodos - Esse repositório trata de estudo dos métodos na linguagem java.
     * Este código trata de um exercíco do curso na dio.me no qual pede a codificação de uma calculadora que faça as quatro operações simples (soma, subtração, multiplicação e divisão) utilizando os ensinamentos de método
     * @author Eduardo Ferreira | @basiern
     * @version 1.0
     * @param args
     * @throws Exception
     */

    import java.util.Scanner;

public class calculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);

    }

    public static void subtração(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println(numero1 + " - " + numero2 + " = " + resultado);
        
    }

    public static void multiplicação(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println(numero1 + " x " + numero2 + " = " + resultado);
        
    }

    public static void divisão(double numero1, double numero2){
        
        double resultado = numero1 / numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);

    }

}
