package br.senai.banco.services;

import static br.senai.banco.Main.ENTRADA;

import br.senai.banco.entidades.Cliente;
import br.senai.banco.repositories.ClienteRepository;

public class ClienteService {

  public static void menuCadastroCliente() {
    System.out.println("Para cadastrar cliente, primeiro digite um nome:");
    String nome = ENTRADA.nextLine();

    System.out.println("Digite um sobrenome:");
    String sobrenome = ENTRADA.nextLine();

    System.out.println("Digite um CPF:");
    String cpf = ENTRADA.nextLine();

    Cliente novoCliente = new Cliente();
    novoCliente.setNome(nome);
    novoCliente.setSobrenome(sobrenome);
    novoCliente.setCpf(cpf);

    ClienteRepository.adicionar(novoCliente);
    System.out.println("Cliente cadastrado com sucesso.");
  }
}
