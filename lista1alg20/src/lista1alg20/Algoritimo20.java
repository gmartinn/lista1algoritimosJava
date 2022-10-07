package lista1alg20;
import java.util.Scanner;

public class Algoritimo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		System.out.println("Informe o valor do lado A do paralelepipedo: ");
		a = sc.nextInt();	
		
		System.out.println("Informe o valor do lado B do paralelepipedo: ");
		b = sc.nextInt();	
		
		System.out.println("Informe o valor do lado C do paralelepipedo: ");
		c = sc.nextInt();
		
		double d = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
		System.out.printf("A diagonal do paralelepipedo eh: %.2f", d);
	}

}
