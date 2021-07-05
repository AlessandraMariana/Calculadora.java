package calculadora;
import java.util.Scanner;

public class Calculadora {
	float calcular_alcance(int investimento_dia) {
		float total_visualizacoes = 0;
		float novas_visualizacoes = 0;
		float cliques = 0;
		float compatilhamentos = 0;
		int contador = 0;
		
		total_visualizacoes = investimento_dia * 30;
		novas_visualizacoes = total_visualizacoes;
		
		while ((contador < 4) && (novas_visualizacoes >= 100)){
			cliques = (novas_visualizacoes / 100) * 12;
			if (cliques >= 20) {  
				compatilhamentos = (cliques / 20) * 3;
			}
		
			total_visualizacoes = total_visualizacoes + (compatilhamentos * 40);
			novas_visualizacoes = compatilhamentos * 40;
			contador = contador + 1;
		}
		
		return total_visualizacoes;
	 }
	
	public static void main(String[] args) {
		int investimento = 0;
		float visualizacoes = 0;
		Scanner input = new Scanner(System.in);
		Calculadora Calculo = new Calculadora();
		
		System.out.println("Insira o valor ");
		investimento = input.nextInt();
		visualizacoes = Calculo.calcular_alcance(investimento);
		System.out.printf("Quantidade m�xima de pessoas que visualizar�o o mesmo an�ncio: %.0f", visualizacoes);
		input.close();
	}
}
