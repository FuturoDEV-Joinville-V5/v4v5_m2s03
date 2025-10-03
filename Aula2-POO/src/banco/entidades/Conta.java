package banco.entidades;

public class Conta {
  private Cliente titular = new Cliente();
  private double saldo = 5.0;

  public void depositar(double valorDeposito) {
    this.saldo += valorDeposito;
    System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valorDeposito);
  }

  public void sacar(double valorSaque) {
    if (valorSaque > this.saldo) {
      System.out.println("Saldo insuficiente.");
    } else {
      this.saldo -= valorSaque;
      System.out.printf("Saque de R$%.2f realizado com sucesso!%n", valorSaque);
    }
  }

  public void transferir(double valor, Conta destino) {
    this.sacar(valor);
    destino.depositar(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }
}
