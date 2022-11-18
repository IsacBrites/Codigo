import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int vetor [] = new int [10];
    int somapar=0;
    for(int i=0;i<10;i++){
      System.out.println("Insira o "+(i+1)+"º número: ");
      vetor [i] = leitura.nextInt();
      if (vetor[i]%2 == 0){
      somapar=somapar+vetor[i];
    }
    }
    System.out.println("A soma dos números pares é igual a: "+somapar);
  }
}