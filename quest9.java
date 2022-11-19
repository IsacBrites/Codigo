import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int idade;
  float peso,media;
  int i, cont = 0, cont2 = 0;

  for (i = 0; i < 2; i++) {
    System.out.println("Informe sua idade: \n");
    idade = sc.nextInt();
    System.out.println("Informe sua seu peso: \n");
    peso = sc.nextFloat();
    System.out.println("\n");
    cont2 = cont2+idade;
    if (peso >90){
      cont = cont + 1;
      System.out.print("\033[H\033[2J");
      System.out.flush();
      }
    media= cont2 /2;
  System.out.println("Média das idades é: \n" +media);
  System.out.println("O nº de pessoas acima do peso é: \n"+cont);
    }
    }
    }