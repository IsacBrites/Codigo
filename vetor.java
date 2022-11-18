import java.util.Scanner;
import java.io.*;
import java.util.Arrays;



class Main {
  public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
  int cont = 0;
  int[][] matriz = new int[3][10];
  int soma = 0;
  int min = 0, max = 0;
    
    
    
for(int linha=0 ; linha < 3 ; linha++){
  for(int coluna = 0; coluna < 10 ; coluna++){
  System.out.printf("Insira o elemento M: ",linha+1,coluna+1);
  matriz[linha][coluna]=ler.nextInt();
       if(matriz[linha][coluna] > cont) { 
      cont = matriz[linha][coluna];
    }
  
  }}

System.out.println("\nA Matriz ficou: \n");
for(int linha=0 ; linha < 3 ; linha++){
for(int coluna = 0; coluna < 10 ; coluna++){
System.out.print(matriz[linha][coluna]); }
System.out.println();
}

System.out.println("\nO número de linhas é: " + matriz.length);
System.out.println("\nO maior número é: " + cont);
for( int linha = 0; linha < matriz.length; linha++) {
for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
        soma += matriz[linha][coluna];
}}
    
System.out.println("\nO valor da soma é: " + soma);
    
        for (int i = 0; i < matriz.length; i++) {
            min = matriz[i][0];
            max = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
           System.out.println("\nMin: " + min + "\nMax: " + max);
}
  
  for (int x = 0; x < 3; x++) {
    int k = 0;
    for (int v = 0; v < 10; v++) {
        k += matriz[x][v];
    }
    System.out.println("\nA média de cada linha é: " + k / 10);
}
    for(int a = 0 ; a < 3 ; a++){
      int neg = 0;
    for(int b = 0; b < 10; b++){
      neg = matriz[a][b];
			if(neg % 2 == 0){
				neg = 1;
         System.out.println("O número substituido é: " + neg);
      }else{
				neg = 1 * -1;	
         System.out.println("O número negativo substituido é: " + neg);
		}}}




    
  }}