import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int valor1, valor2;

    System.out.println("Insira um numero inteiro: ");
    valor1 = ler.nextInt();

    System.out.println("Insira outro numero inteiro: ");
    valor2 = ler.nextInt();
    primeiraClass nome = new primeiraClass(valor1, valor2);

    int soma = nome.Soma();
    System.out.println("Soma: \n" + soma);

    int subt = nome.Subt();
    System.out.println("Subtração: \n" + subt);

    int mult = nome.Mult();
    System.out.println("Multiplicação: \n" + mult);

    int div = nome.Divs();
    System.out.println("Divisão: \n" + div);
  }
}