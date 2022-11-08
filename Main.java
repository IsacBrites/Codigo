import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int numero = 494943;
  ContaBancaria  Silverio_Antonio = new ContaBancaria();
  Silverio_Antonio.numero = numero;
  Silverio_Antonio.nome = "Silvério Antônio";
  System.out.println("\nO seu saldo é "+Silverio_Antonio.consultarSaldo());
  System.out.println("\nO seu limite é "+Silverio_Antonio.consultarLimite());
  }
}