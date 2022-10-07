package lista1alg21;
import java.util.Scanner;

public class Algoritimo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = 0, h = 0;
		
		System.out.println("Informe o valor da base do triangulo: ");
		b = sc.nextInt();
		
		System.out.println("Informe a altura do triangulo: ");
		h = sc.nextInt();
		
		int a = (b * h)/2;
		
		System.out.printf("A area do triangulo eh: %d", a);
	}

}
