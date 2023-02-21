package questao35;

import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int elevadorA = 0;
		int elevadorB = 0;
		int elevadorC = 0;
		int periodoM = 0;
		int periodoV = 0;
		int periodoN = 0;
		double periodostot = 0;
		double elevadortot = 0;
		char elevador;
		char periodo;
		int n = 0;
		int elevadorMaisUsado = 0;
		double periodoMaisUsado = 0;
		double periodoMenosUsado = 10;
		double elevadorMenosUsado =10;
		double elevadorMediano = 0;

		while (n < 10) {
			System.out.println("Elevador que mais utiliza: ");
			elevador = sc.next().charAt(0);
			System.out.println("Horário que utliliza o elevador");
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
			periodostot++;
			elevadortot++;
			n++;
			// elevador mais usado
		}
		if (elevadorA > elevadorB && elevadorA > elevadorC) {
			elevadorMaisUsado = elevadorA;
			System.out.println("O elevadores mais usado: A");
		} else if (elevadorB > elevadorC){
			elevadorMaisUsado = elevadorB;
			System.out.println("O elevadores mais usado: B");
		} else{
			elevadorMaisUsado = elevadorC;
			System.out.println("O elevadores mais usado: C");
		}
		// PERIODO MAIS USADO
		if (periodoM > periodoV && periodoM > periodoN) {
			periodoMaisUsado = periodoM;
			System.out.println("Pela manhâ os elevadores são mais usados");
		} else if (periodoV > periodoN) {
			periodoMaisUsado = periodoV;
			System.out.println("Pela tarde os elevadores são mais usados");
		} else {
			periodoMaisUsado = periodoN;
			System.out.println("Pela noite os elevadores são mais usados");
		}
		//PERIODO MENOS USADO
		if (periodoM < periodoN && periodoM < periodoV) {
			periodoMenosUsado = periodoM;
			System.out.println("O periodo menos usado foi o periodo da manhã");
		} else if (periodoV < periodoN) {
			periodoMenosUsado = periodoV;
			System.out.println("O periodo menos usado foi o periodo da tarde");
		} else {
			periodoMenosUsado = periodoN;
			System.out.println("O periodo menos usado foi o periodo da noite");
		}
		//PERIODO MEDIANAMENTE UTILIZADO

		
		// periodos mais usado de todos e a qual elevador pertence
		// periodo manha
		if (periodoM > periodoN && periodoM > periodoV) {
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println("Pela MANHÃ é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			} else if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println("Pela MANHÃ é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			} else if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println("Pela MANHÃ é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
			// periodo tarde
		} else if (periodoV > periodoN) {
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println("À TARDE é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			}
			if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println("À TARDE é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			}
			if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println("À TARDE é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
			// periodo noite
		} else{
			if (elevadorA > elevadorB && elevadorA > elevadorC) {
				System.out.println("À NOITE é o periodo mais utilizado e o elvador A é o elevador mais usado nesse periodo ");
			} else if (elevadorB > elevadorA && elevadorB > elevadorC) {
				System.out.println("À NOITE é o periodo mais utilizado e o elvador B é o elevador mais usado nesse periodo ");
			} else if (elevadorC > elevadorB && elevadorC > elevadorA) {
				System.out.println("À NOITE é o periodo mais utilizado e o elvador C é o elevador mais usado nesse periodo ");
			}
		}
		// diferenca percentual entre o mais usado dos horarios e o menos usado
		//PORCENTAGEM EM SI
		System.out.printf("Porcentagem do periodo MAIS usado em relaçao aos outros períodos: %.2f", (periodoMaisUsado/periodostot)*100);
		System.out.println("%");
		System.out.printf("Porcentagem periodo MENOS usado em relacão aos outros períodos: %.2f", (periodoMenosUsado/periodostot)*100);
		System.out.println("%");
		//periodo Mediano
		System.out.printf("A porcentagem do elevador MEDIANO é :%.2f", (((periodostot-periodoMaisUsado)-periodoMenosUsado) / periodostot)*100);
		System.out.println("%");
	}

}
