package br.senai.banco.services;

import static br.senai.banco.Main.ENTRADA;

import br.senai.banco.entidades.Cliente;
import br.senai.banco.entidades.Conta;
import br.senai.banco.repositories.ClienteRepository;
import br.senai.banco.repositories.ContaRepository;

public class ContaService {

  public static void menuCadastrarConta() {

    System.out.println("Para cadastrar conta, digite um cpf de cliente:");
    String cpfTitular = ENTRADA.nextLine();

    Cliente titular = ClienteRepository.buscar(cpfTitular);

    if (titular != null) {
      Conta novaConta = new Conta();

      ContaRepository.adicionar(novaConta);
      System.out.println(
          "Conta cadastrada com sucesso. Número da conta: " + novaConta.getNumeroConta());
    } else {
      System.out.println("Cliente não encontrado.");
    }
  }

  public static void menuDepositar() {
    System.out.println("Para depositar, digite primeiro o número da conta:");
    int numContaDeposito = Integer.parseInt(ENTRADA.nextLine());

    Conta contaDeposito = ContaRepository.buscar(numContaDeposito);
    if (contaDeposito != null) {
      System.out.println("Conta encontrada. Digite o valor do depósito:");
      double valorDeposito = Double.parseDouble(ENTRADA.nextLine());
      contaDeposito.depositar(valorDeposito);
      System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valorDeposito);
    } else {
      System.out.println("Conta não encontrada.");
    }
  }

  public static void menuSacar() {
    System.out.println("Para sacar, digite primeiro o número da conta:");
    int numContaSaque = Integer.parseInt(ENTRADA.nextLine());

    Conta contaSaque = ContaRepository.buscar(numContaSaque);
    if (contaSaque != null) {
      System.out.println("Conta encontrada. Digite o valor do saque:");
      double valorSaque = Double.parseDouble(ENTRADA.nextLine());
      if (contaSaque.sacar(valorSaque)) {
        System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valorSaque);
      } else {
        System.out.println("Saldo insuficiente.");
      }

    } else {
      System.out.println("Conta não encontrada.");
    }
  }

  public static void menuVerSaldo() {
    System.out.println("Para ver o saldo, digite primeiro o número da conta:");
    int numConta = Integer.parseInt(ENTRADA.nextLine());

    Conta conta = ContaRepository.buscar(numConta);
    if (conta != null) {
      System.out.printf("Saldo atual: R$%.2f.%n", conta.getSaldo());
    } else {
      System.out.println("Conta não encontrada.");
    }
  }

  public static void menuTransferir() {
    System.out.println("Para transferir, digite primeiro o número da conta origem:");
    int numContaOrigem = Integer.parseInt(ENTRADA.nextLine());

    Conta contaOrigem = ContaRepository.buscar(numContaOrigem);
    if (contaOrigem == null) {
      System.out.println("Conta não encontrada.");
      return;
    }

    System.out.println("Agora digite o número da conta destino:");
    int numContaDestino = Integer.parseInt(ENTRADA.nextLine());

    Conta contaDestino = ContaRepository.buscar(numContaDestino);
    if (contaDestino == null) {
      System.out.println("Conta não encontrada.");
      return;
    }

    System.out.println("Contas encontradas. Digite o valor da transferência:");
    double valor = Double.parseDouble(ENTRADA.nextLine());

    contaOrigem.transferir(valor, contaDestino);

    if (contaOrigem.sacar(valor)) {
      contaDestino.depositar(valor);
      System.out.printf(
          "Transferência de R$%.2f realizada com sucesso da conta %d para conta %d.%n",
          valor, contaOrigem.getNumeroConta(), contaDestino.getNumeroConta());
    } else {
      System.out.printf("Saldo da conta %d insuficiente.%n", contaOrigem.getNumeroConta());
    }
  }
}
