package array;

public class ArrayExcercise {

	public int Solution(int[] A) {

		// Verificação: Array com 1 elemento retorna o elemento
		if (A.length == 1) {
			return A[0];
		}

		// Loop para percorrer o array
		for (int i = 0; i < A.length; i++) {
			// Variável que vai contar o número de ocorrências do elemento que estiver no loop
			int count = 0;

			// Loop para comparar o elemento que está no loop com os outros elementos do array
			for (int j = 0; j < A.length; j++) {
				// Condicional para comparar se o elemento é igual a outros elementos do array
				if (A[i] == A[j]) {
					// Se sim, adiciona 1 ao contador
					count++;
				}
			}
				// Se o contador for ímpar significa que o número não está emparelhado
				if (count % 2 != 0) {
					return A[i];
				}
		}
		return 0;

	}

}
