package euclidean;

public class EuclideanExercise {

	public int Solution(int N, int M) {
		// Array que representa a disposição dos chocolates
		int[] arr = new int[N];
		// contador para a quantidade de vezes que caiu em um chocolate
		int count = 0;
		// booleano para controlar se é um papel ou um chocolate
		boolean opened = false;

		// loop no array de acordo com o enunciado do exercicio
		for (int i = 0; !opened; i+=M) {
			// condicional para impedir que i esteja fora do array
			if (i > arr.length - 1) {
				i -= arr.length;
			}
			// variavel auxiliar para pegar o valor atual do array, antes de altera-la
			int aux = arr[i];
			// condicional para saber se é um chocolate(0) ou papel(1)
			if (arr[i] == 0) {
				// troco o chocolate por papel
				arr[i] = 1;
				// somo 1 ao contador de chocolates encontrados
				count++;
			}

			// se encontrar um papel altero o booleano para encerrar o loop
			if (aux != 0) {
				opened = true;
			}
		}
		// retorno o número de chocolates encontrados
		return count;
	}
}
