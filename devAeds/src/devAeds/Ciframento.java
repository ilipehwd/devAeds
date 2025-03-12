package devAeds;
import java.util.*;

public class Ciframento {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String palavra;
        int chave = 3;

        while (true) {
        	palavra = sc.nextLine();
        	if(palavra.equals("FIM")) {
        		break;
        	}
        	
        	

            if (palavra.equals("FIM")) {
                break;
            }

            StringBuilder cifrado = new StringBuilder();

            for (char c : palavra.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base + chave) % 26 + base);
                }
                cifrado.append(c);
            }

            System.out.println(cifrado.toString());
        }
    
	}
}
