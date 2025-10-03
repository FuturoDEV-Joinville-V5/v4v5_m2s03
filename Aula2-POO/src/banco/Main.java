package banco;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();

    Scanner entrada = new Scanner(System.in);

    c1.depositar(50);
    System.out.println(c1.getSaldo());

    c1.sacar(60);
    System.out.println(c1.getSaldo());
  }
}
