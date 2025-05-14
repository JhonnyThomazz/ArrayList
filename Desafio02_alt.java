package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Desafio02_alt {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(50);
			list.add(num);
		}
		for (int num2 : list) {
			System.out.println(num2);
			System.out.println("multiplicada:"+num2 * 2);
		}

	}
}