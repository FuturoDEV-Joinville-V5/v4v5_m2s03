package br.senai.banco;

import static br.senai.banco.services.ClienteService.menuCadastroCliente;
import static br.senai.banco.services.ContaService.menuCadastrarConta;
import static br.senai.banco.services.ContaService.menuDepositar;
import static br.senai.banco.services.ContaService.menuSacar;
import static br.senai.banco.services.ContaService.menuTransferir;
import static br.senai.banco.services.ContaService.menuVerSaldo;

import java.util.Scanner;

public class Main {
  public static final Scanner ENTRADA = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Bem vindo ao Banco Senai!");
    int opcaoEscolhida;

    do {
      System.out.println("Escolha uma operação:");
      System.out.println("1- Cadastro de Cliente");
      System.out.println("2- Cadastro de Conta");
      System.out.println("3- Depositar");
      System.out.println("4- Sacar");
      System.out.println("5- Ver saldo");
      System.out.println("6- Transferir");
      System.out.println("0- Sair");

      opcaoEscolhida = Integer.parseInt(ENTRADA.nextLine());

      switch (opcaoEscolhida) {
        case 1:
          menuCadastroCliente();
          break;
        case 2:
          menuCadastrarConta();
          break;
        case 3:
          menuDepositar();
          break;
        case 4:
          menuSacar();
          break;
        case 5:
          menuVerSaldo();
          break;
        case 6:
          menuTransferir();
          break;
        case 0:
          System.out.println("Saindo do sistema.");
          break;
        default:
          System.out.println("Digite uma opção válida: 1 - 6");
          break;
      }
    } while (opcaoEscolhida != 0);
  }
}
