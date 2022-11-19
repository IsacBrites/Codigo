import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int i,cont_aluno=0;
    float media,nota1, nota2;
    String nome;
  for(i =0;i<3;i++){
    cont_aluno +=1;
    System.out.println("Insira seu nome: \n");
    nome = sc.next();
    System.out.println("Insira a primeira nota: \n");
    nota1 = sc.nextFloat();
    System.out.println("Insira a segunda nota: \n");
    nota2 = sc.nextFloat();
    media = (nota1+nota2)/2;
    System.out.println("A média é: \n"+media);
  }
  }
}