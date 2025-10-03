package banco;

public class Conta {
  public String nomeTitular;
  public String cpfTitular;
  private double saldo;

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
}
