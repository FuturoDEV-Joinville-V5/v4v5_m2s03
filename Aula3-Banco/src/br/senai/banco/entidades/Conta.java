package br.senai.banco.entidades;

public class Conta {
  private Cliente titular;
  private int numeroConta;
  private double saldo;

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public boolean sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      return true;
    }

    return false;
  }

  public boolean transferir(double valor, Conta destino) {
    if (this.sacar(valor)) {
      destino.depositar(valor);
      return true;
    }

    return false;
  }
}
