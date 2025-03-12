package devAeds;
import java.util.*;

public class Senhas {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String senha = scanner.nextLine();
            
            if(senha.equals("FIM")) {
            	break;
            }
            
            boolean valido = true;

            if (senha.length() < 8) {
                valido = false;
            } else {
                boolean maiuscula = false, minuscula = false, numero = false, especial = false;

                for (int i = 0; i < senha.length(); i++) {
                    char charAtual = senha.charAt(i);
                    if (Character.isUpperCase(charAtual)) {
                        maiuscula = true;
                    } else if (Character.isLowerCase(charAtual)) {
                        minuscula = true;
                    } else if (Character.isDigit(charAtual)) {
                        numero = true;
                    } else {
                        especial = true;
                    }
                }

                if (!maiuscula || !minuscula || !numero || !especial) {
                    valido = false;
                }
            }

            if(valido) {
            	System.out.println("SIM");
            } else {
            	System.out.println("NÃO");
            }
        }

    }

}
