package br.senai.banco.repositories;

import br.senai.banco.entidades.Cliente;
import java.util.ArrayList;

public class ClienteRepository {
  private static ArrayList<Cliente> CLIENTES = new ArrayList<>();

  public static void adicionar(Cliente novo) {
    CLIENTES.add(novo);
  }

  public static Cliente buscar(String cpf) {
    for (Cliente cliente : CLIENTES) {
      if (cliente.getCpf().equalsIgnoreCase(cpf)) {
        return cliente;
      }
    }

    return null;
  }
}
