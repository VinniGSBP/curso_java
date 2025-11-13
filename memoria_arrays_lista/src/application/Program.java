package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Vinicius");
		list.add("Beatriz");

		list.add(2, "Marco"); // add na posicao 2 da lista

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------");

		list.removeIf(x -> x.charAt(0) == 'M'); // Remover elemento que inicia com a letra "M"

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------------");

		System.out.println("Index of Vinicius: " + list.indexOf("Vinicius")); // Posicao do elemento na lista
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList()); // Filtra a lista para informar apenas elementos com a inicial 'V'

		for (String x : list) {
			System.out.println(result);
		}
		System.out.println("--------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // encontrar o primeiro elemento com a letra informada no filter.
		System.out.println(name);
		
		
		
		
		
		
		

	}
}
