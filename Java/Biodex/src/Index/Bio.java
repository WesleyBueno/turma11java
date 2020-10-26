package Index;

import java.util.Scanner;

import Entidades.AlgasProtozoarios;
import Entidades.Animais;
import Entidades.BacteriasCianobacterias;
import Entidades.Fungos;
import Entidades.Vegetais;
import Reinos.Animalia;
import Reinos.Fungi;
import Reinos.Monera;
import Reinos.Plantae;
import Reinos.Protista;

public class Bio {

	public static void main(String[] args) throws InterruptedException {
		
		//Teclado
		
		Scanner  leia = new Scanner(System.in);
		
		//Variáveis
		
		char opc =0;
		char consulta =0;
		char reino = 0;
		char ex=0;
		char finaliza = 0;
		
		//Reinos
		Animalia animais = new Animalia("Mamiferos, Cárnivoros, Herbivoros e Anfíbios");
		Monera bacteria = new Monera("Bacterias e Cianobacterias");
		Fungi fungos = new Fungi("Fungos");
		Plantae plantas = new Plantae("frutas, flores e vegetais");
		Protista protozoarios = new Protista("Algas e Protozoários");
		
		//Animais
		Animais cachorro = new Animais("Cachorro","Animalia","Chordata","Mammalia","Carnivora","Felidae","Felis","Felis Silvestris");
		Animais lobo = new Animais("Lobo","Animalia","Chordata","Mammalia","Carnivora","Felidae","Felis","Felis Silvestris");
		
		//Fungos
		Fungos cogumeloSol = new Fungos("Cogumelo do Sol","Fungi","Basidiomycota","Agaricomycetes","Agaricales","Agaricaceae","Agaricus","Agaricus subrufescens");
		Fungos champignon = new Fungos("Champignon","Fungi","Basidiomycota","Homobasidiomycetes","Agaricales","Agaricaceae","Agaricus","Agaricus bisporus");
		
		
		//Vegetais
		Vegetais rosa = new Vegetais("Rosa","Plantae","Angiospérmicas","Eudicotiledôneas","Rosídeas","Rosales","Rosaceae","Rosa");
		Vegetais maca = new Vegetais("Maçã","Plantae","Angiospérmicas","Eudicotiledôneas","Rosídeas","Rosales","Rosaceae","Malus");
		
		//AlgasProtozoarios
		AlgasProtozoarios protozoario = new AlgasProtozoarios("Protozoario","Protista","Ciliophora","Ciliata","Trichostomatida","Balantiididade","Balantidium","Balantidium coli");
		AlgasProtozoarios alga = new AlgasProtozoarios("Alga verde","Protista","Chlorophyta","Chlorophyceae","Volvocales","Chlamydomonadaceae","Chlamydomonas","Chlamydomonas");
		
		//BacteriasCianobacterias
		BacteriasCianobacterias yakult = new BacteriasCianobacterias("Yakult","Bacteria","Firmicutes","Bacili","Lactobacillales","Lactobacillaceae","Lactobacillus","Lactobacillus casei");
		BacteriasCianobacterias spirulina = new BacteriasCianobacterias("Spirulina","Bacteria","Cyanobacteria","Cyanobacteria","Cyanophyceae","Spirulinales","Spirulinaceae","Spirulina");
		
		//Apresentação
		System.out.println("=================== Seja bem vides ao ===================");
		
		//Pausa
		Thread.currentThread().sleep(1000);
		
		System.out.println("   _     _     _     _     _     _  \r\n"
				+ "  / \\   / \\   / \\   / \\   / \\   / \\ \r\n"
				+ " ( B ) ( i ) ( o ) ( d ) ( e ) ( x )\r\n"
				+ "  \\_/   \\_/   \\_/   \\_/   \\_/   \\_/ ");
		
		//Pausa
		Thread.currentThread().sleep(1000);
		
		
		Pula();
		System.out.println("Olá visitante!");
		
		//Pausa
		Thread.currentThread().sleep(1000);
		
		Pula();
		
		//Loop
		do {
			
			System.out.println("O que gostaria de ver hoje?\n1-Reinos \n2-Categorias taxonomicas");
			opc = leia.next().charAt(0);
			
			Limpa();
			
			if(opc =='1') {
				
				Linha();
				Pula();
				
				System.out.println("Um reino é a categoria de maior abrangência e engloba seres vivos que apresentam características semelhantes,\n"
						+ "porém algumas peculiaridades importantes.\r\n"
						+ "\r\n"
						+ "Atualmente consideramos a existência de cinco reinos: Monera, Protista ou Protoctista, Fungi, Plantae e Animalia.\n"
						+ "Essa classificação foi proposta pelo pesquisador Whittaker em 1969 e até hoje \n"
						+ "é uma das mais aceitas e estudadas no ensino fundamental e médio.");
				
				Pula();
				Linha();
				
				Pula();
				
				System.out.println("Que reino gostaria de conhecer? \n1-Animalia \n2-Fungi \n3-Monera \n4-Plantae \n5-Protista");
				reino=leia.next().charAt(0);
				
				Limpa();
				
				if(reino =='1') {
					System.out.println("REINO ANIMALIA");
					
					System.out.println("Formado por seres multicelulares que obtêm alimento por ingestão. É o caso de anémonas, minhocas,\nborboletas, peixes, sapos, serpentes, aves, cães, seres humanos e tantos outros exemplos.");
					Pula();
					System.out.println("Habitantes: "+animais.getHabitantes());
					
					
				}
				if(reino =='2') {
					System.out.println("REINO FUNGI");
					System.out.println("Formado por seres eucariontes, unicelulares e multicelulares, que absorvem o alimento do meio.\nUm exemplo de fungo multicelular é o cogumelo comestível conhecido por champignon. Um bom exemplo de fungo unicelular é o Saccharomyces cerevisiae, conhecido como fungo da cerveja, por ser utilizado na fabricação de cervejas e vinhos.");
					Pula();
					System.out.println("Habitantes: "+fungos.getHabitantes());
					
				}
				if(reino=='3') {
					System.out.println("REINO MONERA");
					System.out.println("Formado por todos os procariontes, que são as bactérias e as cianobactérias.\nEles possuem um tipo de célula chamada procariótica.");
					Pula();
					System.out.println("Habitantes: "+bacteria.getHabitantes());
					Pula();
				}
				if(reino=='4') {
					System.out.println("REINO PLANTAE");
					System.out.println("Formado por seres multicelulares fotossintetizantes que possuem corpo diferenciado em tecidos.\nE o caso de todas as plantas, como musgos, samambaias, coqueiros, mangueiras, entre muitas outras.");
					Pula();
					System.out.println("Habitantes: "+plantas.getHabitantes());
					
				}
				if(reino=='5') {
					System.out.println("REINO PROTISTA");
					System.out.println("Formado por todos os seres unicelulares eucariontes, como as amebas e as algas unicelulares,\ne por seres multicelulares capazes de fazer fotossíntese, mas com pouca diferenciação do corpo, que são as algas multicelulares. A célula de um protista é eucariótica, ou seja, o material genético é separado do citoplasma em um núcleo individualizado.");
					Pula();
					System.out.println("Habitantes: "+protozoarios.getHabitantes());
					
				}
			}
			if(opc =='2') {
				
				System.out.println("A taxonomia é a área da Biologia dedicada à organização e classificação dos seres vivos."
						+ "\nÉ uma área de extrema importância, pois, afinal de contas, lida com uma quantidade absurda de espécimes e,\n"
						+ "sem uma devida classificação, seria impossível o estudo preciso e vital para a melhoria de conhecimento do \n"
						+ "mundo natural.\r\n"
						+ "\r\n"
						+ "A base dos estudos de taxonomia nada mais é do que a classificação de seres vivos em grupos, para auxiliar \n"
						+ "com maior precisão nos resultados finais de qualquer experiência feita com eles.\n"
						+ "Seja ela para descobrir e curar doenças ou para ajudar no entendimento comportamental, as classificações \n"
						+ "traçam diversos caminho que, no fim, servem como facilitador dos estudos científicos e biológicos.");
				
				Pula();
				System.out.println("Que exemplo deseja consultar? \n1-Animais \n2-Fungos \n3-Vegetais \n4-Algas e Protozoarios \n5-Bactérias e Cianobacterias");
				ex=leia.next().charAt(0);
				
				Limpa();
				
				if(ex =='1') {
					System.out.println("Animais");
					Pula();
					Linha();
					Pula();
					cachorro.Info();
					Pula();
					Linha();
					Pula();
					lobo.Info();
					Pula();
				}
				if(ex =='2') {
					System.out.println("Fungos");
					Pula();
					Linha();
					Pula();
					cogumeloSol.Info();
					Pula();
					Linha();
					Pula();
					champignon.Info();
					Pula();
					
				}
				if(ex =='3') {
					System.out.println("Vegetais");
					Pula();
					Linha();
					Pula();
					rosa.Info();
					Pula();
					Linha();
					Pula();
					maca.Info();
					Pula();
				}
				if(ex =='4') {
					System.out.println("Algas e Protozoarios");
					Pula();
					Linha();
					Pula();
					protozoario.Info();
					Pula();
					Linha();
					Pula();
					alga.Info();
					Pula();
				}
				if(ex =='5') {
					System.out.println("Bactérias e Cianobactérias");
					Pula();
					Linha();
					Pula();
					yakult.Info();
					Pula();
					Linha();
					Pula();
					spirulina.Info();
					Pula();
				}
			}
			Linha();
			Pula();
			
				System.out.println("Deseja continuar consultando?: \n1-Sim \n2-Não");
			Linha();
				consulta = leia.next().charAt(0);
				
				Limpa();
			
			
			//Fim do loop
		} while(consulta == '1');
		
		Pula();
		
		System.out.println("=================== Obrigado pela visita! ===================");
		
		Pula();
		
		//Pausa
		Thread.currentThread().sleep(1000);
		
		System.out.println("   _     _     _     _     _     _  \r\n"
				+ "  / \\   / \\   / \\   / \\   / \\   / \\ \r\n"
				+ " ( B ) ( i ) ( o ) ( d ) ( e ) ( x )\r\n"
				+ "  \\_/   \\_/   \\_/   \\_/   \\_/   \\_/ ");
		
		
		Thread.currentThread().sleep(1000);
		Pula();
		
		
		//Fim do programa
	}
	
	//Funções
	
	//Função pula linha
	public static void Pula() {
		System.out.println("\n");
}

	//Função quebra linha
	public static void Linha() {
		for (int i = 0; i < 50; i++) {
		System.out.printf("=");
	}
	
}
	
	//Função limpa tela
	public static void Limpa() {
		for(int l = 0; l<50;l++) {
		System.out.println("\n");
		
		}
		
	}
	
}