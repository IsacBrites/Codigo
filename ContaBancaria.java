public class ContaBancaria{
  
  //atributos//
  public String nome;
  public int destino,numero;
  private double saldo= 1256.00;
  private double limite = 5000;

  //metodos//
  public void setNome(String nome1){
    this.nome = nome1;
  }
  public void setDestino(int destino1){
    this.destino = destino1;
  }
  public void setSaldo(double saldo1){
    this.saldo = saldo1;
  }
  public void setLimite(double limite1){
    this.limite = limite1;
  }
  public boolean sacar (double valor){
    if (valor<= saldo){
      saldo = saldo-valor;
      return true;
    }
    else{
      return false;
    }
  }
  public void depositar (double valor){
    saldo = saldo+valor;
  }
  public void transfere(int destino, double valor){
    this.saldo = this.saldo - valor;
    
  }
  public double consultarSaldo(){
    return saldo;
  }
  public double consultarLimite(){
    return limite;
  }
}