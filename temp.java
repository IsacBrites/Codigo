import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    double temperatura, temperatura_total =0,media;
    for(int x =1; x<=10;++x){
      System.out.println("Informe a temperatura: "); 
      temperatura = sc.nextDouble();
      temperatura_total = temperatura+temperatura_total;
    }
    media = temperatura_total/10;
     System.out.println("A média das temperaturas é: "+media);
  }
}