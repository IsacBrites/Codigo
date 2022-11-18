import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  LinkedList<String> esporte = new LinkedList<>();
  esporte.add("Futebol");
  esporte.add("Vôlei");
  esporte.add("Natação");
  esporte.add("Polo aquático");
  esporte.add("Hipismo");
  esporte.add("Basquete");
  esporte.add("Handball");
  esporte.add("Corrida");
  esporte.add("Golfe");
  esporte.add("Salto com vara");
  
    
  System.out.printf("Percorrendo a lista:\n");
  System.out.printf("\n");
  int i,num,elemento1,elemento2;
  for (i=0; i<esporte.size(); i++) {
  System.out.printf("Posição %d %s\n", i, esporte.get(i));
    }
  System.out.printf("\n");


  System.out.printf("Elemento adicionado:\n\n");
    esporte.add(0,"Jiu-jitsu");
  for (i=0; i<esporte.size(); i++) {
    System.out.printf("Posição %d %s\n", i, esporte.get(i));
    }
  System.out.printf("\n");


  System.out.printf("Elemento que deseja acessar? ");
  num = ler.nextInt();
  System.out.printf("\n");
  System.out.printf("Elemento acessado é " + esporte.get(num));
  
    
  System.out.printf("\n\nLista organizada: \n");
  Collections.sort(esporte);
  for (String org : esporte) {
    System.out.println(org);
    }


  System.out.printf("\n\nLista randomizada: \n");
  Collections.shuffle(esporte);
  for (String random : esporte) {
    System.out.println(random);
    }
  System.out.printf("\n\nLista ao contrário: \n");
  Collections.sort(esporte, Collections.reverseOrder());
  for (String reverse : esporte) {
    System.out.println(reverse);
    }
}}