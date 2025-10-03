package tiposreferencia;

import banco.entidades.Conta;

public class Main {
  public static void main(String[] args) {
    /*

        // exemplo atribuicao tipo primitivo
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // exemplo atribuicao tipo por referencia
        Conta c1 = new Conta();
        c1.depositar(100);

        Conta c2 = c1;

        System.out.println("Valor saldo c1: " + c1.getSaldo());
        System.out.println("Valor saldo c2: " + c2.getSaldo());

        c2.depositar(50);

        System.out.println("Valor saldo c1: " + c1.getSaldo());
        System.out.println("Valor saldo c2: " + c2.getSaldo());
        System.out.println(c1 == c2);
    */

    // exemplo criando 2 objetos
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();

    conta1.depositar(50);

    System.out.println("Saldo conta 1: " + conta1.getSaldo());
    System.out.println("Saldo conta 2: " + conta2.getSaldo());

    conta2.depositar(200);

    System.out.println("Saldo conta 1: " + conta1.getSaldo());
    System.out.println("Saldo conta 2: " + conta2.getSaldo());
    System.out.println(conta1 == conta2);

    conta2.transferir(15, conta1);

    System.out.println("Saldo conta 1: " + conta1.getSaldo());
    System.out.println("Saldo conta 2: " + conta2.getSaldo());
  }
}
