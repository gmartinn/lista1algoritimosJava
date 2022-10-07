package lista1alg10;
import java.util.Scanner;

public class Algoritimo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		int p = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("digite dois numeros inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		p = a * b;
		
		System.out.printf("produto dos numeros digitados: %d", p);
	}

}
