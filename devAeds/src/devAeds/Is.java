package devAeds;
import java.util.*;

public class Is {

	public static void main(String[] args) {
		String frase, x1, x2, x3 ,x4;
		int inicio;
		boolean vogal, consoante, inteiro, real;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			frase = sc.nextLine();
			
			if (frase.equals("FIM")) {
				break;
			}
			vogal = true;
			char[] palav = frase.toCharArray();
			
			for (int i = 0; i < palav.length; i ++) {
				if (palav[i] != 'a' && palav[i] != 'e' && palav[i] != 'i' && palav[i] != 'o' && palav[i] != 'u' &&
					    palav[i] != 'A' && palav[i] != 'E' && palav[i] != 'I' && palav[i] != 'O' && palav[i] != 'U') {
					    vogal = false;
					    break;
				}
			}
			
			consoante = true;
			for (int i = 0; i < palav.length; i ++) {
				if(palav[i] == 'a' || palav[i] == 'e' || palav[i] == 'i' || palav[i] == 'o' || palav[i] == 'u' ||
					palav[i] == 'A' ||palav[i] == 'E' ||palav[i] == 'I' ||palav[i] == 'O' ||palav[i] == 'U') {
					consoante = false;
					break;
				}
			}
			
			inteiro = true;
			if((frase.charAt(0) == '-')) {
				inicio = 1;
			} else {
				inicio = 0;
			}
			for (int i = inicio; i < frase.length(); i++) {
	            if (!Character.isDigit(frase.charAt(i))) {
	            	inteiro = false;
	            	break;
	            }
	        }
			
			if((frase.charAt(0) == '-')) {
				inicio = 1;
			} else {
				inicio = 0;
			}
			real = false;
			boolean pontoEncontrado = false;
			real = true;

			for (int i = inicio; i < frase.length(); i++) {
			    char charAtual = frase.charAt(i);

			    if (charAtual == '.') {
			        if (pontoEncontrado) {
			            real = false;
			            break;
			        }
			        pontoEncontrado = true;
			    } else if (!Character.isDigit(charAtual)) {
			        real = false;
			        break;
			    }
			}
			if (!pontoEncontrado) {
			    real = false;
			}

			
			if(vogal) {
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			
			if(consoante) {
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			
			if(inteiro) {
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			
			if(real) {
				System.out.println("SIM ");
			} else {
				System.out.println("NAO ");
			}
			
			
		}

	}

}
