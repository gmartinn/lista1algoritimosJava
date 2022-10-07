package lista1alg13;
import java.util.Scanner;

public class Algoritimo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, d = 0;
		System.out.println("Digite quatro numeros: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		a = a * 1;
		b = b * 2;
		c = c * 3;
		d = d * 4;
		
		double mP = (a + b + c + d)/10;
		
		System.out.printf("A media ponderada eh: %.2f", mP);
	}

}
