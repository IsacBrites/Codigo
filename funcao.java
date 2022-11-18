import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 Scanner leitura = new Scanner(System.in);
 
 int num1,num2,num3,num,nm;
 double numero1,numero2,numero3;
 //----------------------------Dobro--------------------------------------//
  System.out.println("Insira um numero: ");
  num1 = leitura.nextInt();
 System.out.println("O dobro desse numero é: "+dobro(num1));
 //----------------------------Maior--------------------------------------//
  System.out.println("Informe o segundo numero: ");
  num2 = leitura.nextInt();
  System.out.println("Informe o terceiro número: ");
  num3 = leitura.nextInt();

 System.out.println("O maior número é: "+maior(num2,num3));
 
 //----------------------------Média--------------------------------------//
  System.out.println("Insira um numero: ");
  numero1 = leitura.nextInt();

  System.out.println("Insira um numero: ");
  numero2 = leitura.nextInt();

  System.out.println("Insira um numero: ");
  numero3 = leitura.nextInt();
 System.out.println("A média é: "+media(numero1,numero2,numero3));
//----------------------------Fatorial---------------------------------//
  System.out.println("Insira um numero: ");
  num = leitura.nextInt();
 System.out.println("O fatorial é: "+fatorial(num));
 //----------------------------Soma--------------------------------------//
  System.out.println("Insira um numero: ");
  nm = leitura.nextInt();
 System.out.println("A soma é: "+soma1(nm));
  }
//----------------------------FunçãoDobro---------------------------------//
  public static int dobro(int n1){

   return n1*2;
    
  }
//----------------------------FunçãoMaior---------------------------------//
  public static int maior(int n1,int n2){

    if(n1>n2){
      return n1;
    } else{
      return n2;
    }
  }
//----------------------------FunçãoMédia---------------------------------//
  public static double media (double n1, double n2, double n3){
    return (n1+n2+n3)/3;
  }
//----------------------------Fatorial---------------------------------//
public static int fatorial(int n1){
   
   int fat=1;
   int cont=1;
    
   for(int i=1;i<=n1;++i){
      fat=fat*i;
   }
    System.out.println("!" + n1 + " = " + fat);
   cont++;
    
  
    while(cont<2);
   return (fat);
    }
//----------------------------Soma---------------------------------//
public static int soma1(int n1){
  int x;
  x =n1;
  for(int i =0; i< x; i++){
   n1 = n1+i;
  }
  return (n1);
}
}