package lista1alg14;
import java.util.Scanner;

public class Algoritimo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0.0;
		double b = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite seu saldo: ");
		
		a = sc.nextDouble();
		b = a + (a * 0.01);
		System.out.printf("seu saldo apos o reajuste eh de: %.2f ", b);
	}

}
