package ex1;
import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter widht: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Enter height:");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
		
		
		
		sc.close();
	}

}
