package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Desafio03_alt {

	public static void main(String[] args) {
		ArrayList<Integer> positive = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(-10, 10);
			positive.add(num);
		}
		System.out.println("\nOs numeros informados que são positivos: ");
		for (int num2 : positive) {
			if (num2 > 0) {
				System.out.println(num2);
			}
		}System.out.println("\nNúmeros negativos: ");
		for (int num3 : positive) {
			if (num3 < 0) {
				System.out.println(num3);
			}
		}

	}

}
