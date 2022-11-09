class Main {
  public static void main(String[] args) {
    
    Produto Picanha = new Produto("Picanha" , 69.80);
    Produto Heineken = new Produto("Fardo Heineken",36.50);
    Produto Carvao = new Produto("Carvão" , 18.00);
    Produto Coca = new Produto("Coca cola 2l" , 7.50);
    Produto Linguica = new Produto("Linguiça Toscana: " , 16.96);
    Produto Asinha = new Produto("Meio da Asa: " , 21.96);
    Produto Pao_De_Alho= new Produto("Pão de alho" , 11.00);


    

    System.out.println(Picanha.id);
    System.out.println(Heineken.id);
    System.out.println(Carvao.id);
    System.out.println(Coca.id);
    System.out.println(Linguica.id);
    System.out.println(Asinha.id);
    System.out.println(Pao_De_Alho.id);
    
    Picanha.exibir();
    Heineken.exibir();
    Carvao.exibir();
    Coca.exibir();
    Linguica.exibir();
    Asinha.exibir();
    Pao_De_Alho.exibir();

    
    

  }
}