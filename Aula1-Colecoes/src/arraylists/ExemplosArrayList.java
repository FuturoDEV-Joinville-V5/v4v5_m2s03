package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemplosArrayList {
  public static void main(String[] args) {

    ArrayList<String> nomes = new ArrayList<>();

    nomes.add("João");
    nomes.add("Maria");
    nomes.add("Fernando");
    nomes.add("Vanderlei");
    nomes.add(1, "Mayara");
    nomes.add("João");

    for (String nome : nomes) {
      System.out.println(nome);
    }

    System.out.println("A primeira letra de cada nome da lista:");
    for (int i = 0; i < nomes.size(); i++) {
      String nome = nomes.get(i);
      System.out.println(nome.charAt(0));
    }

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o nome que deseja remover da lista:");

    String nomeExcluir = entrada.nextLine();

    if (nomes.contains(nomeExcluir)) {
      nomes.remove(nomeExcluir);
    } else {
      System.out.println("Esse nome já não existe na lista.");
    }

    for (String nome : nomes) {
      System.out.println(nome);
    }

    nomes.remove(3);

    System.out.println("Lista após remoção do elemento 3");
    for (String nome : nomes) {
      System.out.println(nome);
    }

    System.out.println("Lista após reverse:");
    Collections.reverse(nomes);
    for (String nome : nomes) {
      System.out.println(nome);
    }

    System.out.println("Maior elemento: " + Collections.max(nomes));
    System.out.println("Menor elemento: " + Collections.min(nomes));

    Collections.sort(nomes);

    System.out.println("Lista ordenada:");

    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
