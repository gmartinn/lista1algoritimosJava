package lista1alg25;
import java.util.Scanner;

public class Algoritimo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 0, h = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o raio da lata de oleo: ");
		r = sc.nextInt();
		
		System.out.println("Informe a altura da lata de oleo: ");
		h = sc.nextInt();
		
		double g = 3.14159 * Math.pow(r, 2) * h;
		System.out.printf("O volume da lata de oleo eh: %.2f", g);
	}

}
