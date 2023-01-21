public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.printIn("Volume Atual: " + smartTv.volume);
        
        System.out.println("TV está ligada? "smartTv.ligada);
        System.out.printIn("Canal Atual: "smartTv.canal);
        System.out.printIn("Volume Atual: "smartTv.volume);

        smartTv.ligar ();
        System.out.printIn("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
