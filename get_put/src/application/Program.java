package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
/* Covariancia GET / PUT
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list= intList;
		
		Number x = list.get(0);
		
		list.add(20);
		*/
		
		//Contravariancia GET / PUT
		
	/*	List<Object> myObjs = new ArrayList<>();
		myObjs.add("Vinicius");
		myObjs.add("Beatriz");
		
		List<? super Number> myNumbers = myObjs;
		
		myNumbers.add(20);
		myNumbers.add(3.14);
		
		
		Number x = myNumbers.get(0); // erro de compilacao
		*/
		
		//Exemplo 2 - Adicionando uma lista a outra.
		
		List<Integer> myInts = Arrays.asList(1, 2 , 3 , 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
		public static void copy(List<? extends Number> source, List<? super Number> destiny) {
			for(Number number : source) {
				destiny.add(number);
			}
			
				}
		public static void printList(List<?> list) {
			for(Object obj : list) {
				System.out.print(obj + " ");
			}
			System.out.println();
		}
}
