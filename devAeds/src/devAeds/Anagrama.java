package devAeds;
import java.util.*;

public class Anagrama {

	public static boolean saoAnagramas(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String frase = scanner.nextLine();
            
            if(frase.equals("FIM")) {
            	break;
            }
            
            String[] palavras = frase.split(" ");
            String palavra1 = palavras[0];
            String palavra2 = palavras[1];

            if (saoAnagramas(palavra1, palavra2)) {
                System.out.println("SIM");
            } else {
                System.out.println("NãO");
            }
        }

    }

}
