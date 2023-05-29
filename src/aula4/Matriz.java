package aula4;

public class Matriz {

	public static void main(String[] args) {
		/*
		 * int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}}; outra forma de declarar
		 */
		int matrizInteiros[][] = {
				{10, 15, 35},
				{70, 120, 140}, //declaracao para melhor visualizacao da matriz em forma de tabela
				{50, 100, 150}
		};
		
		//percorrendo a matriz para saída de dados
		 for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) { //matriz.lenght = tamanho da linha
	            for (int indiceColuna = 0; indiceColuna < matrizInteiros[indiceLinha].length; indiceColuna++) { ////matriz[indiceLinha].lenght = tamanho da coluna
	                System.out.println(
	                    "[" + indiceLinha + "][" + indiceColuna + "] é: " + 
	                matrizInteiros[indiceLinha][indiceColuna]);
	            }
		 }
		 
		 System.out.println("Tamanho da Linha: " + matrizInteiros.length);
		 System.out.println("Tamanho da Coluna: " + matrizInteiros[0].length); //acessando a linha 0 para contar quantas colunas a linha possui

		
	}

}
