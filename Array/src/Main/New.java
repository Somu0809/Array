package Main;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range : ");
		int first = sc.nextInt();
		System.out.println("Enter the end range : ");
		int sec = sc.nextInt();
		
        
        int[] numbers = new int[sec - first + 1];

        for (int i = first; i <= sec; i++) {
            numbers[i - first] = i;
        }

        System.out.println("Odd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + ",");
            }
        }
        
        System.out.println("");
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + ",");
            }
        }
		
		sc.close();

	}

}
