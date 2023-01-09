package com.greatlearning.currencyDenomination;

public class MergeSortImplementation {
	// Main function that sorts array[left...right] using merge()
	public void sort(int[] notes, int low, int high) {
		if (low < high) {
			// find the middle point
			int mid = (low + high) / 2;
			// Sort first and second halves
			sort(notes, low, mid);
			sort(notes, mid + 1, high);
			// merge the sorted halves
			merge(notes, low, mid, high);
		}
	}

	private void merge(int[] notes, int low, int mid, int high) {
		int i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		int[] tempArr = new int[high + 1];
		while (i <= mid && j <= high) {
			if (notes[i] > notes[j])
				tempArr[k++] = notes[i++];
			else
				tempArr[k++] = notes[j++];
		}
		for (; i <= mid; i++)
			tempArr[k++] = notes[i];
		for (; j <= high; j++)
			tempArr[k++] = notes[j];
		for (i = low; i <= high; i++)
			notes[i] = tempArr[i];
	}
}
