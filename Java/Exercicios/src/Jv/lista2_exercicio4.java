package Jv;

import java.util.Scanner;

public class lista2_exercicio4 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int idade;
	final int LIMITE =5;
	byte sexo;
	byte tipoHumor;
	int totalF,totalM, pessoasCalmas =0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0,calmasMenor17=0;
	char continua ='S';
	int contador =1;
	
	while(contador <=LIMITE) {
		System.out.println("Digite sua idade:");
		idade =leia.nextInt();
		
		System.out.println("Digite 1-Feminino 2-masculino 3-outros");
		sexo =leia.nextByte();
		
		System.out.println("Digite 1-Calma 2-Nervosa 3-Agressiva");
		tipoHumor=leia.nextByte();
		
		if(tipoHumor ==1) {
			
			pessoasCalmas = pessoasCalmas +1;
			
		}
		
		if(tipoHumor == 2 && sexo == 1) {
			
			mulheresNervosas = mulheresNervosas +1;
		}
		if(tipoHumor == 3 && sexo == 2) {
			
			homensAgressivos = homensAgressivos +1;
		}
		
		if(tipoHumor == 1 && sexo ==3) {
			
			outrosCalmos = outrosCalmos +1;
		}
		
		if(tipoHumor == 2 && idade >40) {
			
			nervosas40 = nervosas40 +1;
		}
		if(tipoHumor == 1 && idade <18) {
			
			calmasMenor17 = calmasMenor17 +1;
		}
		contador++;
		
	}
	
	System.out.printf("\nTotal de pessoas calmas: %d",pessoasCalmas);
	System.out.printf("\nTotal de mulheres nervosas: %d",mulheresNervosas);
	System.out.printf("\nTotal de homens agressivos: %d",homensAgressivos);
	System.out.printf("\nTotal de outros calmos: %d",outrosCalmos);
	System.out.printf("\nTotal de pessoas nervosas com idade superior a 40 anos: %d",nervosas40);
	System.out.printf("\nTotal de pessoas calmas com idade menor que 17 anos: %d",calmasMenor17);
	leia.close();
	
	}

}
