package devAeds;

import java.util.*;

public class Soma {

	public static int somaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String frase = scanner.nextLine();
            
            if(frase.equals("FIM")) {
            	break;
            }
            
            int numero = Integer.parseInt(frase);
            int resultado = somaDigitos(numero);
            System.out.println(resultado);
         }
        }

	}
