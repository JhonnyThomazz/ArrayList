package aula15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_test02 {

	public static void main(String[] args) {
		String[] disciplinas = { "matemática", "filosofia", "história", "física" };
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("Língua Inglesa");

		for (String list : novaLista) {
			System.out.println("Disciplina: " + list);
			System.out.println(" ");
		}
	}

}
