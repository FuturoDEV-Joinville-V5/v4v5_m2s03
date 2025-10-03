package main;

import entidades.Carro;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Carro unoDeFirma = new Carro();
    unoDeFirma.buzinar();

    unoDeFirma.cor = "branco";
    unoDeFirma.modelo = "uno";
    unoDeFirma.fabricante = "Fiat";
    unoDeFirma.anoFabricacao = 2010;
    unoDeFirma.qtdPortas = 2;
    unoDeFirma.possuiEscadaEmCima = true;

    Carro sandero = new Carro();
    sandero.modelo = "Sandero";
    sandero.fabricante = "Renault";
    sandero.cor = "prata";
    sandero.anoFabricacao = 2015;
    sandero.qtdPortas = 4;
    sandero.possuiEscadaEmCima = false;

    System.out.println("Velocidade atual: " + unoDeFirma.velocidade);

    Scanner entrada = new Scanner(System.in);
    System.out.println("Pise no acelerador!");
    System.out.println("Escolha um valor para acelerar:");
    System.out.println("1 - 10 km/h");
    System.out.println("2 - 20 km/h");
    System.out.println("3 - 30 km/h");
    System.out.println("4 - 40 km/h");
    int opcaoUsuario = Integer.parseInt(entrada.nextLine());

    /*if (opcaoUsuario == 1) {
      unoDeFirma.acelerar(10);
    } else if (opcaoUsuario == 2) {
      unoDeFirma.acelerar(20);
    } else if (opcaoUsuario == 3) {
      unoDeFirma.acelerar(30);
    } else if (opcaoUsuario == 4) {
      unoDeFirma.acelerar(40);
    } else {
      System.out.println("Favor digitar uma opção válida: 1 a 4.");
    }*/

    switch (opcaoUsuario) {
      case 1:
        unoDeFirma.acelerar(10);
        break;
      case 2:
        unoDeFirma.acelerar(20);
        break;
      case 3:
        unoDeFirma.acelerar(30);
        break;
      case 4:
        unoDeFirma.acelerar(40);
        break;
      default:
        System.out.println("Favor digitar uma opção válida: 1 a 4.");
    }

    System.out.println("Velocidade atual: " + unoDeFirma.velocidade);

    ArrayList<Carro> carros = new ArrayList<>();
    carros.add(unoDeFirma);
    carros.add(sandero);

    unoDeFirma.somBuzina = "BIBII";
    sandero.somBuzina = "FONFON";

    for (Carro carro : carros) {
      /*System.out.printf(
      "Carro: %s, cor: %s, ano fabricação: %d.%n",
      carro.modelo, carro.cor, carro.anoFabricacao);*/
      System.out.println(carro);
      carro.buzinar();
    }
  }
}
