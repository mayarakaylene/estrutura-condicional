import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else if (codigo == 5) {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
