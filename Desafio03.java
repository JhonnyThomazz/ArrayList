package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> positive = new ArrayList<Integer>();
		System.out.println("informe 6 números, positivos e negativos: ");
		for (int i = 0; i < 6; i++) {
		int num = scanner.nextInt();
		positive.add(num);
		
		} System.out.println("\nOs numeros informados que são positivos: ");
		for(int num2 : positive) {
			if(num2 >0) {
				System.out.println(num2);
			}
		}	
		scanner.close();
	}

}
