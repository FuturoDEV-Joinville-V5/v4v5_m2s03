package entidades;

public class Carro {
  public String modelo;
  public String fabricante;
  public int anoFabricacao;
  public int qtdPortas;
  public String cor;
  public double velocidade;
  public boolean possuiEscadaEmCima;
  public String somBuzina;

  public void acelerar(double aceleracao) {
    this.velocidade = this.velocidade + aceleracao;
  }

  public void frear(double freagem) {
    this.velocidade = this.velocidade - freagem;
  }

  public void buzinar() {
    System.out.println(this.somBuzina);
  }

  public String toString() {
    return String.format(
        "modelo: %s, fabricante: %s, ano: %d, cor: %s",
        this.modelo, this.fabricante, this.anoFabricacao, this.cor);
  }
}
