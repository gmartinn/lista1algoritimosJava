package lista1alg11;
import java.util.Scanner;

public class Algoritimo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.0;
		double b = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero real: ");
		
		a = sc.nextDouble();
		b = a/3;
		
		System.out.printf("A terca parte do numero digitado eh: %.2f", b);
	}

}
