public class Usuario {
   
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    
        //Agora vamos ligar a tv, utilizando o método
        smartTv.ligar();
        System.out.println("\nLiguei a tv. A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("\nDesliguei a tv. A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("\nAumentando volume para " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("\nAumentando volume para " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("\nAumentando volume para " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("\nMudando canal para " + smartTv.canal);


    }
}
