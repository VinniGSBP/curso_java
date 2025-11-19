package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice() >= 100.00); Predicado em forma de expressao lambda
		
		//list.removeIf(new ProductPredicate()); // Predicado criado.
		
		//list.removeIf(Product::staticProductPredicate); //Reference method com método estático	
		
		//list.removeIf(Product::nonStaticProductPredicate); //Reference method com método não estático
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; //Expressão lambda declarada
		
		list.removeIf(pred); //Expressão lambda declarada
		
		for (Product p : list)
		System.out.println(p);
	}
	
}
