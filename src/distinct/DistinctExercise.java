package distinct;

import java.util.ArrayList;

public class DistinctExercise {

	public int Solution(int[] A) {

		// Quando o array tem apenas 2 elementos, verifico se são iguais ou diferentes e retorno
		if (A.length == 2) {
			return A[0] == A[1] ? 1 : 2;
		}

		// Quando o array tem menos de 2 elementos, retorno 1 para 1 elemento ou 0 quando não possui elementos
		if (A.length < 2) {
			return A.length == 1 ? 1 : 0;
		}

		// Array auxiliar que gurdará os valores diferentes
		ArrayList<Integer> arrDistinct = new ArrayList<>();

		for(int i = 0; i < A.length; i++){

			// Variável para controlar se o elemento não está no array auxiliar
			boolean distinct = true;

			// Se o array auxiliar estiver vazio adiciono o valor nele e passo o 'distinct' para false
			if (arrDistinct.size() == 0) {
				arrDistinct.add(A[i]);
				distinct = false;

			} else {
				// Loop no array auxiliar para comparar se ele já tem a variavel do loop do array A
				for (int j = 0; j < arrDistinct.size(); j++) {
					// Se a variavel já estiver presente eu seto o distinct pra false e saiu do loop do array auxiliar
					if (A[i] == arrDistinct.get(j)) {
						distinct = false;
						break;
					}
				}
				// Se o elemento for distinto ele é adicionado ao array auxiliar
				if (distinct) {
					arrDistinct.add(A[i]);
				}
			}
		}
		// retorno o tamanho do array auxiliar que contém todos os elementos distintos
		return arrDistinct.size();

	}

}
