package buscaanodecopa;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaAnoDeCopa {
  public static void main(String[] args) {
    int[] anosDeCopa = {
      2022, 2018, 2014, 2010, 2006, 2002, 1998, 1994, 1990, 1986, 1982, 1978, 1974, 1970
    };

    Scanner entrada = new Scanner(System.in);

    System.out.println("Bem vindo ao programa DESCUBRA SE É ANO DE COPA!");
    System.out.println("Digite um ano:");

    int anoUsuario = Integer.parseInt(entrada.nextLine());

    // busca binária
    Arrays.sort(anosDeCopa);
    int indexAnoUsuario = Arrays.binarySearch(anosDeCopa, anoUsuario);

    if (indexAnoUsuario >= 0) {
      System.out.printf("Sim, o ano %d foi um ano de copa!", anoUsuario);
    } else {
      System.out.printf("Não, o ano %d não foi um ano de copa!", anoUsuario);
    }

    /*
    // busca por força bruta
        boolean usuarioAcertou = false;

        for (int ano : anosDeCopa) {
          if (ano == anoUsuario) {
            usuarioAcertou = true;
            break;
          }
        }

        if (usuarioAcertou) {
          System.out.printf("Sim, o ano %d foi um ano de copa!", anoUsuario);
        } else {
          System.out.printf("Não, o ano %d não foi um ano de copa!", anoUsuario);
        }*/
  }
}
