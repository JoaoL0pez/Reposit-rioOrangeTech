public class SmartTv {
    boolean ligada = false; //boolean é a definição primitiva, em seguida a variavel e depois o valor a ser atribuido.
    int canal = 1;
    int volume = 25;

    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
    }
    public void diminuirVolume() {
        //volume = volume - 1;
        volume--;
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}
