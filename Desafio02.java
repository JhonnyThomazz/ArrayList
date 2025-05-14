package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Desafio02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list_mult = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(50);
			list.add(num);
			list_mult.add(num * 2);
		}
		System.out.println(" " + "Lista comum");
		System.out.print(list);
		System.out.println(" ");
		System.out.println(" " + "Lista multiplicada");
		System.out.println(list_mult);
	}

}
