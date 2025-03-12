package devAeds;
import java.util.*;

public class Alteracao {

	public static void main(String[] args) {
		String frase;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			frase = sc.nextLine();
			
			if(frase.equals("FIM")) {
				break;
			}
			
			Random gerador = new Random();
			gerador.setSeed(4);
			char letra1 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
            char letra2 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
            StringBuilder novaLinha = new StringBuilder();

            for (char c : frase.toCharArray()) {
                if (c == letra1) {
                    novaLinha.append(letra2);
                } else {
                    novaLinha.append(c);
                }
            }
            System.out.println(novaLinha.toString());
		}
	}
}
