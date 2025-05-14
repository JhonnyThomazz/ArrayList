package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Desafio01 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			int numAleatorio = random.nextInt(100);
			lista.add(numAleatorio);
			
		}System.out.println("lista completa: ");
		for(int num : lista) {
			System.out.println(num);
		}System.out.println("\nlista sem o quarto elemento: ");
		lista.remove(4);
		for(int num : lista ) {
			System.out.println(num);
		}
		

	}

}
