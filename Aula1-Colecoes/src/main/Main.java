package main;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    String[] carros;

    int[] anosDeCopa = {2022, 2018, 2014, 2010, 2006, 2002};

    carros = new String[4];

    carros[0] = "fusca";
    carros[1] = "uno";
    carros[2] = "gol";
    carros[3] = "sandero";
    // carros[4] = "kwid";

    for (int i = 0; i < anosDeCopa.length; i++) {
      System.out.println(anosDeCopa[i]);
    }

    int i = 0;
    while (i < anosDeCopa.length) {
      System.out.println(anosDeCopa[i]);
      i++;
    }

    System.out.printf("O primeiro carro do array de carros tem %d letras.%n", carros[0].length());

    /*System.out.println(anosDeCopa[0]);
    System.out.println(anosDeCopa[1]);
    System.out.println(anosDeCopa[2]);
    System.out.println(anosDeCopa[3]);*/

    for (String carro : carros) {
      System.out.println(carro);
    }

    Arrays.sort(anosDeCopa);

    for (int ano : anosDeCopa) {
      System.out.println(ano);
    }
  }
}
