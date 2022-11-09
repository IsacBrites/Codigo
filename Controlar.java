public class Controlar{
  private int opcao_De_Cedula, valor = 2,valor_total, troco, dinheiro=0,cedula_extra;
  private int preco_unitario = 2;
  private int quantidade;
   public void setOpcao_De_Cedula(int opcao_De_Cedula1){
    this.opcao_De_Cedula = opcao_De_Cedula1;
  }
  public void setPreco_unitario(int preco_unitario1){
    this.preco_unitario = preco_unitario1;
  }
  public void setQuantidade(int quantidade1){
    this.quantidade = quantidade1;
  }
   public int getOpcao_De_Cedula(){
    return this.opcao_De_Cedula;
  }
   public int getQuantidade(){
    return this.quantidade;
  }
  public void compra (int quantidade,int valor){
    valor = quantidade * preco_unitario;
  }
  public void setCedula_extra(int cedula_extra1){
    this.cedula_extra = cedula_extra1;
  }
  public void escolha (int cedula){
    if(cedula == 1){
      dinheiro = 1+ this.cedula_extra;
    }
    else if (cedula == 2){
      dinheiro= 2+ this.cedula_extra;
    }
    else if (cedula == 3){
      dinheiro = 5+ this.cedula_extra;
    }
    else{
      dinheiro = 10+ this.cedula_extra;
    }
    valor_total = valor* getQuantidade();
    if(dinheiro >= valor_total){
      troco = dinheiro - valor_total;
      if(troco!=0){
        
      
      System.out.println("\nCompra realizada!\nO seu troco é: "+troco);
    }
      else{
      System.out.println("\nTodo valor gasto, você não receberá troco!");
    }
    }
    else{
      troco = dinheiro;
      System.out.println("\nNão é possivel concluir a operação!\nRetornando o valor de: "+troco);
    }
}
  
}