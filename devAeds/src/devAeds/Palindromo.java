package devAeds;
import java.util.*;

public class Palindromo {

    public static void main(String[] args){
        String palavra;
        boolean palin = true;
        Scanner sc = new Scanner(System.in);

        while(true){
            palavra = sc.nextLine();
            
            if (palavra.equals("FIM")){
            	break;
            }
            
            char[] palav = palavra.toCharArray();
            int j = palav.length-1;
            palin = true;
            for(int i = 0; i < palav.length / 2; i++){

                if(palav[i] != palav[j]){
                    palin = false;
                    break;
                }
                j--;
            }

            if(palin){
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
    }
}