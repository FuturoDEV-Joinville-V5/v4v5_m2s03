package banco;

import banco.entidades.Cliente;
import banco.entidades.Conta;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();

    Cliente titular = new Cliente();
    titular.setNome("João");
    titular.setSobrenome("Oliveira");
    titular.setCpf("111.222.333-00");
    titular.setDataNascimento("25/02/1991");

    c1.setTitular(titular);

    System.out.printf(
        "Titular da conta: %s %s, nascido em: %s.%n",
        c1.getTitular().getNome(),
        c1.getTitular().getSobrenome(),
        c1.getTitular().getDataNascimento());

    Scanner entrada = new Scanner(System.in);

    c1.depositar(50);
    System.out.println(c1.getSaldo());

    c1.sacar(60);
    System.out.println(c1.getSaldo());
  }
}
