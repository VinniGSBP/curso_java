package estrutura_condicional;
import java.util.Scanner;
public class atribuicao_acumulativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minuto;
		minuto = sc.nextInt();
		double conta = 50.00;
		
		if (minuto > 100) {
			conta += (minuto - 100) * 2.0;
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
	

	}

}
