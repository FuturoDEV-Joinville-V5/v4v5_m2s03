package arraylists.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioFernando {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> lista1 = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();

    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite um nome " + i + ": ");
      String valor = scanner.nextLine();
      lista1.add(valor);

      if (valor.length() < 3) {
        lista2.add(valor);
      }
    }

    lista1.removeAll(lista2);

    System.out.println("\n=== RESULTADOS ===");
    System.out.println("Quantidade de nomes da lista1: " + lista1.size());
    System.out.println("Quantidade de nomes da  lista2: " + lista2.size());
  }
}
