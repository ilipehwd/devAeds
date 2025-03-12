package devAeds;
import java.util.*;

public class ContaPalavras {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String frase = scanner.nextLine();
            
            if(frase.equals("FIM")) {
            	break;
            }

            String[] palavras = frase.split("\\s+");
            System.out.println(palavras.length);
        }

    }

}
