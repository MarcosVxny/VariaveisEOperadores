package ATIVIDADES;

import java.util.Scanner;

public class NotaParticipante {

	    public static void main(String[] args) {

	        String nome = "Participante";
	        float notas = 0, nota1,nota2,nota3,nota4,media;

	        Scanner leia = new Scanner(System.in);

	        System.out.println("\nEntre com a primeira nota");
	        nota1 = leia.nextFloat();

	        System.out.println("Entre com a segunda nota");
	        nota2 = leia.nextFloat();

	        System.out.println("Entre com a terceira nota");
	        nota3 = leia.nextFloat();

	        System.out.println("Entre com a quarta nota");
	        nota4 = leia.nextFloat();

	        media = (nota1+nota2+nota3+nota4) / 4;

	        System.out.println("\nMedia do" +nome+" foi de: "+media);

	    }
}