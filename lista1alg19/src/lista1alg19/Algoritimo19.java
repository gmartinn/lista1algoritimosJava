package lista1alg19;
import java.util.Scanner;

public class Algoritimo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do seu quadrado: ");
		l = sc.nextInt();
		
		double p = 4 * l;
		double a = Math.pow(l,2);
		double d = l * Math.sqrt(2);
		
		System.out.printf("\nPerimetro do quadrado: %.2f", p);
		System.out.printf("\nArea do quadrado: %.2f", a);
		System.out.printf("\nDiagonal do quadrado: %.2f", d);
	}

}
