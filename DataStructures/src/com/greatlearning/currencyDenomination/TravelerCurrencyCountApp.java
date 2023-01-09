package com.greatlearning.currencyDenomination;

import java.util.Scanner;

public class TravelerCurrencyCountApp {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) 
		{
			notes[i] = sc.nextInt();
		}
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes, 0, notes.length - 1);
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		NotesCount ns = new NotesCount();
		ns.notesCountImplementation(notes, amount);
	}
}
