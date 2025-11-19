package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
// EXEMPLO 1 DE MAP
		/*
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Phone", "99771122");
		
		cookies.remove("Email");
		cookies.put("Phone", "9245213");
		System.out.println("Contains 'Phone' keys: " + cookies.containsKey("Phone"));
		System.out.println("Size: " + cookies.size());
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("All cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
			*/
		
		//Exemplo 2 MAP
		Map<Product, Double> stock = new HashMap<>();
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		}
	}


