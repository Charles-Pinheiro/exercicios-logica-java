package euclidean;

public class EuclideanExercise {

	public int Solution(int N, int M) {
		int[] arr = new int[N];
		int count = 0;
		boolean opened = false;

		for (int i = 0; !opened; i+=M) {
			if (i > arr.length - 1) {
				i -= arr.length;
			}
			int aux = arr[i];
			if (arr[i] == 0) {
				arr[i] = 1;
				count++;
			}

			if (aux != 0) {
				opened = true;
			}

		}
		return count;
	}
}
