/**
     * Métodos - Esse repositório trata de estudo dos métodos na linguagem java.
     * Este código trata exercíco do curso na dio.me no qual pede a codificação de uma máquina que retorne "bom dia/boa tarde/boa noite" a depender da hora do dia.
     * @author Eduardo Ferreira | @basiern
     * @version 1.0
     * @param args
     * @throws Exception
     */
public class mensagem {

    public static void obterMensagem(int hora){
        if ( 24 < hora  ) {

            System.out.println("Hora inválida.");

        } else if(18 <= hora) {

            System.out.println("Boa noite!");

        } else if(12 <= hora) {

            System.out.println("Boa tarde!");

        } else if ( 5 <= hora  ) {
            
            System.out.println("Bom dia!");

        } else if ( 0 <= hora ) {
            
            System.out.println("Boa noite!");
        
        } else {

            System.out.println("Hora inválida.");

        }

    };


    
}
