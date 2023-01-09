package currencyDenomination;

import java.util.Scanner;

public class CurrencyCountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter the size of currency denomination");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int[] notes = new int[size];
			System.out.println("enter the currency denominations value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			MergeSort ms = new MergeSort();
			ms.sort(notes,0,notes.length-1);
			System.out.println("enter the amount you want to pay");
			int amount = sc.nextInt();
			NoteCount ns = new NoteCount();
			ns.noteCountImpl(notes,amount);
		}

	}

