import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  //instanciar objetos//
  ContaBancaria Isac = new ContaBancaria();
  Isac.numero = 1090;
  Isac.banco = 567;
  Isac.agencia = 100;
  Isac.cpf = 19000;
  Isac.depositar(1000);
  if (Isac.sacar(5000.0) == true){
    System.out.println("\nSaque realizado com sucesso\n");
  }
  else{
    System.out.println("\nProcure Gerente. Operação não autorizada\n");
  }
    System.out.println("\nO seu saldo é "+Isac.consultarSaldo());

  
  ContaBancaria Alvaro = new ContaBancaria();
  Alvaro.numero = 1090;
  Alvaro.banco = 567;
  Alvaro.agencia = 100;
  Alvaro.cpf = 19000;
  Alvaro.depositar(1000);
  if (Alvaro.sacar(5000.0) == true){
    System.out.println("\nSaque realizado com sucesso\n");
  }
  else{
    System.out.println("\nAqui não caloteiro!\n");
  }
    System.out.println("\nO seu saldo é "+Alvaro.consultarSaldo());
    System.out.println("\nO saldo do banco é: "+(Isac.consultarSaldo()+Alvaro.consultarSaldo()));
  }
  
}