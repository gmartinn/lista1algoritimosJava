package lista1alg17;
import java.util.Scanner;

public class Algoritimo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 0, b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do retangulo: ");
		h = sc.nextInt();
		System.out.println("Digite o tamanho da base do retangulo: ");
		b = sc.nextInt();
		
		int p = 2*(b + h);
		int a = b * h;
		int d = (int) (Math.pow(b, 2) + Math.pow(h, 2));
		double e = Math.sqrt(d);
		
		System.out.printf("\nvalor do perimetro: %d", p);
		System.out.printf("\nvalor da area: %d", a);
		System.out.printf("\nvalor da diagonal: %.2f", e);
	}

}
