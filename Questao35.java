package questao35;

// importando o scanner para o projeto
import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// pimeiro passo declarar as varáveis usadas no problema
		int elevadorA = 0;
		int elevadorB = 0;
		int elevadorC = 0;
		int periodoM = 0;
		int periodoV = 0;
		int periodoN = 0;
		double periodostot = 0;
		char elevador;
		char periodo;
		int n = 0;
		int elevadorMaisUsado = 0;
		double periodoMaisUsado = 0;
		double periodoMenosUsado = 10;
		double elevadorMenosUsado = 10;
		double elevadorestot = 0;
		// estrutura de repetição
		while (n < 10) {
			// comandos para adquirir dados do usuário
			System.out.println("Elevador que mais utiliza: ");
			System.out.println("elevador - A");
			System.out.println("elevador - B");
			System.out.println("elevador - C");
			elevador = sc.next().charAt(0);

			System.out.println("Horário que utliliza o elevador");
			System.out.println("M - matuttino");
			System.out.println("V - vespertino");
			System.out.println("N - noturno");
			periodo = sc.next().charAt(0);

			// elevadores
			if (elevador == 'A') {
				elevadorA++;
			} else if (elevador == 'B') {
				elevadorB++;
			} else if (elevador == 'C') {
				elevadorC++;
			}

			// periodos
			if (periodo == 'M') {
				periodoM++;
			} else if (periodo == 'V') {
				periodoV++;
			} else if (periodo == 'N') {
				periodoN++;
			}
			elevadorestot++;
			periodostot++;
			n++;
			/*
			 * primeiro vou utilizar algumas estruturas condicionais para verificar qual dos
			 * elevadores é o mais utilizado juntamente com o seu período.
			 */
		}
		if (elevadorA > elevadorB && elevadorA > elevadorC) {

			elevadorMaisUsado = elevadorA;
			System.out.println("1 - O elevador mais frequentado: A");
			if (periodoM > periodoV && periodoM > periodoN) {
				System.out.println("Maior fluxo no período da manhã");
			} else if (periodoV > periodoN) {
				System.out.println("Maior fluxo no período da tarde");
			} else {
				System.out.println("Maior fluxo no período noite");
			}
		} else if (elevadorB > elevadorC) {
			elevadorMaisUsado = elevadorB;
			System.out.println("1 - O elevador mais frequentado: B");
			if (periodoM > periodoV && periodoM > periodoN) {
				System.out.println("Maior fluxo no período da manhã");
			} else if (periodoV > periodoN) {
				System.out.println("Maior fluxo no período da tarde");
			} else {
				System.out.println("Maior fluxo no período noite");
			}
		} else {
			elevadorMaisUsado = elevadorC;
			System.out.println("1 - O elevador mais frequentado: C");
			if (periodoM > periodoV && periodoM > periodoN) {
				System.out.println("Maior fluxo no período da manhã");
			} else if (periodoV > periodoN) {
				System.out.println("Maior fluxo no período da tarde");
			} else {
				System.out.println("Maior fluxo no período noite");
			}
		}
		// DESCOBRINDO O ELEVADOR MENOS USADO
		if (elevadorA < elevadorB && elevadorA < elevadorC) {
			elevadorMenosUsado = elevadorA;
		} else if (elevadorB < elevadorC) {
			elevadorMenosUsado = elevadorB;
		} else {
			elevadorMenosUsado = elevadorC;
		}
		/*
		 * segundo vou utilizar algumas estruturas condicionais para verificar qual dos
		 * elevadores sãa menos utilizados.
		 */
		if (periodoM > periodoV && periodoM > periodoN) {
			periodoMaisUsado = periodoM;
		} else if (periodoV > periodoN) {
			periodoMaisUsado = periodoV;
		} else {
			periodoMaisUsado = periodoN;
		}
		// 3 ponto ver qual dos 3 horários foi menos utilizado os elevadores
		if (periodoM < periodoN && periodoM < periodoV) {
			periodoMenosUsado = periodoM;
		} else if (periodoV < periodoN) {
			periodoMenosUsado = periodoV;
		} else {
			periodoMenosUsado = periodoN;
		}

		/*
		 * Aqui se tem a parte mais interessante que eu achei na resolução devido ao uso
		 * de uma condicional dentro de outra. Aqui primeiramente quis saber qual
		 * período era o mais utilizado e depois disso saber desse período qual era o
		 * elevador que predominava o uso,
		 */
		// periodos mais usado de todos e a qual elevador pertence.
		// periodo manha
		if (periodoM > periodoN && periodoM > periodoV) {
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println(
						"2 - Pela MANHÃ é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			} else if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println(
						"2 - Pela MANHÃ é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			} else if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println(
						"2 - Pela MANHÃ é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
			// periodo tarde
		} else if (periodoV > periodoN) {
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println(
						"2 - À TARDE é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			}
			if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println(
						"2 - À TARDE é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			}
			if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println(
						"2 - À TARDE é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
			// periodo noite
		} else {
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println(
						"2 - À NOITE é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			} else if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println(
						"2 - À NOITE é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			} else if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println(
						"2 - À NOITE é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
		}
		/*
		 * Aqui trago os resultados afim de mostrar o que a questão pede. Certamente eu
		 * poderia ter achado outras formas de expressar os resultados. Porém dessa
		 * forma achei bem facilitada e que qualquer pessoa poderia entender.
		 */

		System.out.printf("3 - Porcentagem do periodo MAIS usado em relaçao aos outros períodos: %.0f",
				(periodoMaisUsado / periodostot) * 100);
		System.out.println("%");
		// periodo Mediano
		System.out.printf("4 - A porcentagem do elevador MEDIANO é :%.0f",
				(((elevadorestot - elevadorMaisUsado) - elevadorMenosUsado) / elevadorestot) * 100);
		System.out.println("%");
		/*
		 * Se você chegou até aqui quero pedir obrigado pela paciência para ler tudo
		 * isso kkk.
		 *
		 * Qualquer feedback que puder me dar estou a disposição!!!
		 * 
		 */
		sc.close();
	}

}
