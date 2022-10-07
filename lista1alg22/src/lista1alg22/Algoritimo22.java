package lista1alg22;
import java.util.Scanner;

public class Algoritimo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d = 0, D = 0;
		
		System.out.println("informe a diagonal menor do seu losango: ");
		d = sc.nextInt();
		
		System.out.println("informe a diagonal maior do seu losango: ");
		D = sc.nextInt();
		
		int a = (d * D)/2;
		
		System.out.printf("A area do losango eh: %d", a);
	}

}
