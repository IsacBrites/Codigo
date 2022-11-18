import java.util.Scanner;
import java.util.Arrays;
import java.io.*;


class Main {
  public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
    int maior =0;
     int[][] matriz = new int[4][5];
  String nomes[][] ={ 
{"João", "Pedro", "Maria", "Clara", "Lucas"},
{"Pedro", "Maria"}, 
{"Pedro", "Maria", "Clara"},
{"João" , "Pedro" , "Lucas"}
};  
  System.out.println(Arrays.deepToString(nomes[0]));
  System.out.println(Arrays.deepToString(nomes[1]));
  System.out.println(Arrays.deepToString(nomes[2]));
  System.out.println(Arrays.deepToString(nomes[3]));
  for(int linha=0 ; linha < matriz.length ; linha++){
  for(int coluna = 0; coluna < matriz[linha].length ; coluna++){
  System.out.printf("\nQuem possui amizade com quem? [%d][%d]: ",linha+1,coluna+1);
  matriz[linha][coluna]=ler.nextInt();
       if(matriz[linha][coluna] > maior) { 
      maior = matriz[linha][coluna];
    }
  
  }}
  System.out.println("\nAs amizades são: \n");
  for(int linha=0 ; linha < matriz.length ; linha++){
  for(int coluna = 0; coluna < matriz[linha].length ; coluna++){
  System.out.print(matriz[linha][coluna]); }
  System.out.println();
}

}
}
