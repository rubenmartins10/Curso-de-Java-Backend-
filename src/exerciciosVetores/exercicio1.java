package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt(); //guarda diretamente o número no índice i do vetor
        }
		
		for (int i = 0; i < n; i++) {
            if (vect[i] < 0 && vect[i] < 10) {
                System.out.println(vect[i]);
            }
        }
		
		sc.close();
		
		
	}

}
