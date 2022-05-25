package fundamentos;

/* Tipos primitivos em Java*/
// Resumo teorico da aula#1

// Datas
// CHAR
// 'a' , ' ' , '?' , '1'

// Boolean (No java nao existe outra declaracao para false e true.)
// false e true

/* 6 tipos valores numericos */
// 4 tipos valores inteiros de numeros (A diferenca entre os tipos e a capacidade deles)
	//		byte 1: - 128 ate 127
	//		short 2: +- 32.767
	//		int 4
	//		long 8

// 2 tipos valores flutuantes
//	float 4
//	double 8

/* Aula pratica #2 */

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informacoes de funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 127;
//		byte anosDeEmpresa = 128; Limite de range
		short numerosDeVoos = 32767;
//		short numerosDeVoos = 32768; Limite de range
		int id = 2147483647;
//		int id = 2147483648; Limite de range
		
		/* Os tipos longs precisam da letra L no final do valor atribuido a variavel*/
		// Senão o Java entende ela como INT //
		long pontosAcumulados = 9_223_372_036_854_775_807L;
//		long pontosAcumulados = 9_223_372_036_854_775_808L; Limite de range
		
		// Tipos numericos reais(Literais)
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_102.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A';
		// declarando 1 caractere com unicode da tabela ASCII
//		char status2 = '\u0010';
		
		// Dias de empresa
		System.out.println("O funcionario tem "+ anosDeEmpresa * 365 + " dias de empresa.");
		
		// Numero de viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println("Pontos por real " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
