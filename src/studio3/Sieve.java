package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Starting Number: ");
		int startingNum = in.nextInt();
		
		boolean[] sieveArray;
		sieveArray = new boolean[startingNum];
		for (int i = 0; i < sieveArray.length; i++) {
			sieveArray [i] = true;
		}
		
		for (int i = 2; i < sieveArray.length; i++) {
			for (int j = i*i; j < sieveArray.length; j+=i){
				sieveArray [j] = false;
				
				
				
			}
		
		}

	for (int i = 0; i < sieveArray.length; i++)
	{
		if (sieveArray [i] == true)
		System.out.println(i);
	}

}
}
