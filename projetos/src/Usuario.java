public class Usuario {
  public static void main (String [] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal da TV: " + smartTv.canal);
    System.out.println("Volume da TV: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("TV ligada? " + smartTv.ligada);
    smartTv.aumentarVolume();
    System.out.println("Volume da TV: " + smartTv.volume);
    smartTv.mudarCanal(99);
    System.out.println("Canal da TV: " + smartTv.canal);
  }
}
