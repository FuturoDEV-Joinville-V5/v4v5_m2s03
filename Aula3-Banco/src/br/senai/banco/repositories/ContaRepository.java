package br.senai.banco.repositories;

import br.senai.banco.entidades.Conta;
import java.util.ArrayList;

public class ContaRepository {

  private static final ArrayList<Conta> CONTAS = new ArrayList<>();
  private static int proxNumConta = 1;

  public static void adicionar(Conta novo) {
    novo.setNumeroConta(proxNumConta++);
    CONTAS.add(novo);
  }

  public static Conta buscar(int numeroConta) {
    for (Conta conta : CONTAS) {
      if (conta.getNumeroConta() == numeroConta) {
        return conta;
      }
    }

    return null;
  }
}
