package lista1alg15;
import java.util.Scanner;

public class Algoritimo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 kW = 1/7 do salario min
		double sMin = 0.0;
		double kW = 0.0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite o valor do salario min: ");
		sMin = sc.nextDouble();
		
		System.out.println("Digite a quantidade de kilowatts");
		kW = sc.nextDouble();
		
		double kWPreco = sMin / 7 / 100;
		
		System.out.printf("preco em reais do kW: %.2f", kWPreco);
		System.out.printf("\npreco da conta em reais: %.2f", kWPreco * kW);
		System.out.printf("\npreco da conta em reais com 10 porcento de desconto: %.2f", (kWPreco * kW) - (kWPreco * kW * .10));
	}

}
