package ATIVIDADES;

import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {


	    String nome =  "Funcionario";
	    float salario = 10000, NovoSalario;
	    float abono = 1000;

	    Scanner leia = new Scanner(System.in);

	    System.out.println("\nDigite o salario: ");
	    salario = leia.nextFloat();

	    System.out.println("\nDigite o abono: ");
	    abono = leia.nextFloat();

	    System.out.println(NovoSalario= salario+abono);
	    System.out.println("\nSeu novo salario é: " +NovoSalario);




	    }

	}