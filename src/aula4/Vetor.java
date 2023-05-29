package aula4;

public class Vetor {

	public static void main(String[] args) {
	  //tipo   nomeVetor[] = {"entrada de dados manualmente"};
		String vetorCachorros[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
	//percorrendo o vetor com laço for
		for (int numero = 0; numero < vetorCachorros.length; numero++) {
			System.out.println((numero + 1) + "º Casa: " + vetorCachorros[numero]);
		}

	}
}