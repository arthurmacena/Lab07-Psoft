package main;

import java.util.Scanner;

import strategy.CaixaAlta;
import strategy.CaixaBaixa;
import strategy.Formatacoes;
import strategy.Italico;
import strategy.Negrito;
import strategy.PublicaTexto;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PublicaTexto publicacao = new PublicaTexto();
		
		boolean flag = true;
		while(flag) {
		String texto = menuTexto(scan);
		String digito = menuFormatacao(scan);
		mostraTexto(texto, digito, publicacao);
		flag = menuFinalizacao(scan);
		}
		
	}

	private static void mostraTexto(String texto, String digito, PublicaTexto publicacao) {
		Formatacoes CaixaAlta = new CaixaAlta();
		Formatacoes CaixaBaixa = new CaixaBaixa();
		Formatacoes Italico = new Italico();
		Formatacoes Negrito = new Negrito();
		
		publicacao.setTexto(texto);
		if(digito.equals("1")){
			publicacao.setTipoDeFormatacao(CaixaAlta);
		}
		else if(digito.equals("2")) {
			publicacao.setTipoDeFormatacao(CaixaBaixa);
		}
		else if (digito.equals("3")) {
			publicacao.setTipoDeFormatacao(Negrito);
		}
		else if (digito.equals("4")) {
			publicacao.setTipoDeFormatacao(Italico);
		}
		
		System.out.println(publicacao.mostraPublicacao());
	}

	private static boolean menuFinalizacao(Scanner scan) {
		System.out.println("Se nao gostou da publicacao e quiser repetir o processo digite 1:");
		String digito = scan.nextLine();
		if(digito.equals("1")) {
			return true;
		}
		else {
			System.out.println("Sempre que precisar publicar um texto volte sempre!");
			return false;
		}
	}

	private static String menuTexto(Scanner scan) {
		System.out.println("Bem-vindo ao programa para imprimir textos.");
		System.out.println("Digite o texto a ser impresso:");
		String texto = scan.nextLine();
		return texto;
	}	

	private static String menuFormatacao(Scanner scan) {
		System.out.println("Se você deseja imprimir em caixa alta digite 1");
		System.out.println("Se você deseja imprimir em caixa baixa digite 2");
		System.out.println("Se você deseja imprimir em negrito digite 3");
		System.out.println("Se você deseja imprimir em italico digite 4");
		String digito = scan.nextLine();
		return digito;
	}

}
