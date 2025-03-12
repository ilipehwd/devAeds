package devAeds;
import java.util.*;

public class Inversao {

	public static void main(String[] args) {
		String frase;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	frase = sc.nextLine();
        	
        	if (frase.equals("FIM")) {
        		break;
        	}
        	
            char[] invertido = frase.toCharArray();
            for(int j = invertido.length-1; j >= 0; j--) {
            	System.out.print(invertido[j]);
            }
            System.out.println();
        }

	}

}