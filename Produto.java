public class Produto {
  int id;
  String nome;
  double Preco;
  private static int Utilmold =0;
  
  public int getid(){
    return this.id;
  }
  
  public void setPreco(double valor){
    if (valor > 0 ){
    this.Preco = valor;
    }
    else {
      this.Preco = 0 ;
    }
  }
  
  public double getPreco(){
    return this.Preco;
  }

  public void setNome(String nome1){
    this.nome = nome1;
  }
  public String getNome(){
    return this.nome;
  }

  public void validador(String nome ,double precoP ){

  this.setPreco(precoP);
    
  }

  public void exibir(){
    System.out.println("\nProduto: "+this.nome);
    System.out.println("\nO ID do produto é:\n\n"+this.id);
    System.out.println("\nO preço do produto é:\n\n"+this.Preco+"\n");
  }

  public Produto(){
    this.id = Utilmold;
    Produto.Utilmold++;
    
  }

  public Produto( String nome2 , double preco1){

    this.id = Utilmold;
    Produto.Utilmold++;
    this.nome = nome2 ;
    this.Preco = preco1;
  }
}