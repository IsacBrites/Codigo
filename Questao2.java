import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int lutadores;
    System.out.println("\nO lutador escolhido foi o Ken.");
    String vetor [] = {"\nOs adversários são:\n","CHUNLI","ZAGUIEF","BLANKA","GUILE", "RYU", "DHALSIM"};
     for(int i=0;i<vetor.length;i++){
       System.out.println(vetor [i]);
      }
    System.out.println("\nInsira o número de lutadores derrotados: \n");
    lutadores = ler.nextInt();
    if(lutadores >= 6){
      System.out.println("\nHora dos Bosses.");
    }
    else{
      System.out.println("\nCaso queira jogar novamente, insira outra ficha.");
    }
  }
}